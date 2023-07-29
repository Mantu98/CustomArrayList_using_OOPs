# CustomArrayList_using_OOPs

 
public class CustomArrayList {
    int cap;
    int[] arr;
    int nel; // next element location

    CustomArrayList() {
        this.cap = 1;
        this.nel = 0;
        this.arr = new int[cap];
    }

    public void add(int ele) { // O(30)
        if (this.nel == this.cap) {
            // System.out.println("grow");
            Grow();
        }
        this.arr[this.nel++] = ele;
    }

    public void add(int idx, int ele) { // O(n)
        if (this.nel == this.cap)
            Grow();
        if (idx < 0 || idx > this.Size())
            System.out.println("index out of bond");
        else {
            for (int i = idx; i < this.Size(); i++) {
                int temp = arr[idx];
                arr[idx] = ele;
                ele = temp;
            }
            arr[this.Size()] = ele;
            this.nel++;
        }
    }

    public void remove() { // O(1)
        this.nel--;
    }

    public void remove(int idx) { // O(n)
        if (idx < 0 || idx > this.Size())
            System.out.println("index out of bond");
        else {
            for (int i = idx; i < this.Size() - 1; i++)
                arr[i] = arr[i + 1];
            this.nel--;
        }
    }

    private void Grow() { // O(n)
        this.cap *= 2;
        int[] temp = new int[this.cap];
        for (int i = 0; i < Size(); i++) {
            temp[i] = arr[i];
        }
        this.arr = temp;
    }

    public int Size() { // O(1)
        return this.nel;
    }

    public String toString() { // O(n)
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.Size() - 1; i++) {
            sb.append(arr[i]).append(", ");
        }
        sb.append(arr[this.Size() - 1]);
        sb.append("]");
        return sb.toString();
    }
}


    
          
      
