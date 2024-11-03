
class Heap{
    int[] heap ;
    int size;
    Heap(){
        size = 0;
        heap = new int[100];
        heap[0]=-1;
    }

    public void insert(int val){
        size +=1;
        int index = size;

        heap[index] = val;

        while(index >1){
            int parent = index/2;
            if(heap[parent]<heap[index]){
                int tmp = heap[parent];
                heap[parent]= heap[index];
                heap[index]=tmp;
                index = parent;
            }else{
                break;
            }
        }
    }  

    public int delete(){
        if(size == 0) return -1;
        int val = heap[1];
        heap[1] = heap[size--];
        
        int i=1;

        while(i<size){
            int leftIndex = 2*i;
            int rightIndex = 2*i+1;

            if(leftIndex <size &&  heap[i] < leftIndex){
                int tmp = heap[i];
                heap[i] = heap[leftIndex];
                heap[leftIndex]= tmp;
                i=leftIndex;
            }else if(rightIndex<size && heap[i]<rightIndex){
                int tmp = heap[i];
                heap[i] = heap[rightIndex];
                heap[rightIndex]= tmp;
                i=rightIndex;
            }
            else{
                return val;
            }
        }

        return val;
    }

    public void print(){
        for(int i=1;i<=size;i++){
            System.out.println(heap[i]);
        }
    }


    public void heapify(int[] heap, int n, int i){
        int smaller = i;
        int left = 2*i;
        int right = 2*i+1;
        
        if(left <n && heap[smaller] <heap[left])smaller = left;
        if(right<n&&heap[smaller]<heap[right])smaller = right;

        if(smaller != i){
            int tmp = heap[smaller];
            heap[smaller] = heap[i];
            heap[i]=tmp;
            heapify(heap, n, smaller);
        }
    }

    public void heapSort(int[] arr, int n){
        int size = n;
        while (size>1) {
            int tmp = arr[size];
            arr[size--]  = arr[1];
            arr[1] = tmp;

            this.heapify(arr,size,1);

        }
    }
}


public class Heap01{

    public static void main(String... args){
        Heap h = new Heap();
        // h.insert(2);
        // h.insert(3);
        // h.insert(1);
        // h.print();
        // System.out.println(h.delete()+" \n");
        
        // h.print();
        int arr[] = {-1,1,2,3,4,5,7,8};
        int n=arr.length;
        for(int i=n/2;i>0;i-- )h.heapify(arr,n,i);
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println();
        n=arr.length;
        h.heapSort(arr, n-1);
        for(int i:arr){
            System.out.println(i);
        }
    }
    
}