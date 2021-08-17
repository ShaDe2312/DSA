#include<iostream>
#include<math.h>
using namespace std;

template <typename T> 
class Array{
    public:
        T* A;
        unsigned int size=255;
        unsigned int length;


    Array(int s){
        A= new T[s];
        size=s;
        length=0;
    }

    ~Array(){
        delete []A;
    }

    bool inBound(int idx){
        if(idx>=0 && idx<=size)
            return true;
        return false;
    }

    void display(int till){
        cout<<"\n";
        for(int i=0; i<till; i++){
            cout<<A[i]<<" ";
        }
    }

    void display(){
        cout<<"\n";
        for(unsigned int i=0; i<size; i++){
            cout<<A[i]<<" ";
        }
    } 

    void initialise(size_t n){
        cout<<"Please enter "<<n<<" variables:\n";

        for (size_t i = 0; i < n; i++)
        {
            cin>>A[i];
        }

        length=n;
        
    } 

    void insert(T val, unsigned int idx){
        
        if(idx>=0 && idx<length && idx<size){

        for(size_t i=length;i>idx;i--){
            A[i]=A[i-1];
        }
        A[idx]=val;
        length++;
        }

    }

    void deleteElement(unsigned int idx){
        if(idx>=0 && idx<length-1 && idx<size){

            for(size_t i=idx; i<length; i++)
                A[i]=A[i+1];

            length--;
        }
    }

    int linearSearchTransposition(T key){
        T temp;
        for(size_t i=0; i<length; i++){
            if(A[i]==key){
                temp=A[i];
                A[i]=A[i-1];
                A[i-1]=temp;
                return i;
            }
        }

        return -1;
    }

    int linearSearch(T key){
        T temp;
        for(size_t i=0; i<length; i++){
            if(A[i]==key){
                return i;
            }
        }
        return -1;
    }

    int BinSearch(T key){
        
        int low=0;
        int high=length-1;
        int mid= 0;

        while(low<=high){

            mid=floor((low+high)/2);

            if(key==A[mid]){
                return mid;
            }

            else if(key>A[mid]){
                low=mid+1;
            }

            else{
                high=mid-1;
            }
        }

        return -1;
    }   

    int RBinSearch(int low, int high, T key){
        int mid;
        if(low<=high){
            mid=floor((low+high)/2);

            if(key==A[mid])
                return mid;

            else if(key>A[mid]){
                return RBinSearch(mid+1,high,key);
            }

            else{
                return RBinSearch(low,mid-1,key);
            }
        }

        return -1;

    }

    T get(int idx){
        if(inBound(idx)){
            return A[idx];
        }
    }

    void put(T value, int idx){
        if(inBound(idx)){
            A[idx]=value;
        }
    }

    double sum(){
        double sum;
        for(size_t i=0 ; i<length; i++){
            sum+=A[i];
        }

        return sum;
    }

    double avg(){
        return sum()/length;
    }

    T max(){
        T max=A[0];
        for(size_t i=0; i<length;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        return max;
    }
    T min(){
        T min=A[0];
        for(size_t i=0; i<length;i++){
            if(A[i]<min){
                min=A[i];
            }
        }
        return min;
    }    

    void reverse(){
        size_t i,j;
        T temp;
        for(i=0,j=length-1; i<j; i++,j--){
            temp=A[j];
            A[j]=A[i];
            A[i]=temp;
        }
    }

    bool isSorted(){

        for(size_t i=0; i<length-1; i++){
            if(A[i]>A[i+1])
                return false;
        }

        return true;
    }

    void sortedInsertion(T newValue){

        for(int i=length-1; ;i--){
            if(newValue < A[i]){
                A[i+1]=A[i];    
            }

            else{
                A[i+1]=newValue;
                break;
            }
        }
    }
};

int main()
{
    int key=7;
    Array<int>A(10);
    A.initialise(9);
    A.display();

    A.isSorted() ? cout<<"Array is sorted": cout<<"Array is not sorted";

    A.sortedInsertion(57);
    A.display();

    return 0;
}

/*  A.display();
    A.insert(100,3);
    A.display();
    A.deleteElement(3);
    cout<<"\n"<<"Key: "<<key<< " found at idx "<<A.RBinSearch(0,9,key)<<endl;
    A.display();
    cout<<"\nSum of the array is:\t"<<A.sum();
    cout<<"\nAverage of the array is:\t"<<A.avg();
    cout<<"\nMax of the array is:\t"<<A.max();
    cout<<"\nMin of the array is:\t"<<A.min();
    cout<<"\nAfter reversing:\n";
    A.reverse();
    A.display();
*/