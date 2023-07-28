
public class CustomArrayList {
    int cap;
    int[] arr;
    int nel; // next element location

    CustomArrayList() {
        this.cap = 1;
        this.nel = 0;
        this.arr = new int[cap];
    }

    public void add(int ele) {
        if (this.nel == this.cap) {
            System.out.println("grow");
            Grow();
        }
        this.arr[this.nel++] = ele;
    }

    public void add(int idx, int ele) {
        if (this.nel == this.cap)
            Grow();
        else if (idx == this.nel)
            this.arr[this.nel++] = ele;
        else if (idx == 0) {
            int[] temp = new int[this.Size() + 1];
            temp[0] = ele;
            for (int i = 0; i < this.Size(); i++)
                temp[i + 1] = this.arr[i];
            this.nel++;
            this.arr = temp;
        }

        else if (0 < idx & idx < this.nel) {
            int[] temp = new int[this.Size() + 1];
            for (int i = 0; i < idx; i++)
                temp[i] = this.arr[i];
            temp[idx] = ele;
            for (int i = idx; i < this.Size(); i++)
                temp[i + 1] = this.arr[i];
            this.nel++;
            this.arr = temp;
        }
    }

    public void remove() {
        this.nel--;
    }

    public void remove(int idx) {
        if (idx == this.nel)
            this.nel--;
        else if (idx >= 0 & idx < this.nel) {
            int[] temp = new int[this.cap];
            for (int i = 0; i < idx; i++)
                temp[i] = this.arr[i];
            for (int i = idx + 1; i < this.Size(); i++)
                temp[i - 1] = this.arr[i];
            this.arr = temp;
            this.nel--;
        }
    }

    private void Grow() {
        this.cap *= 2;
        int[] temp = new int[this.cap];
        for (int i = 0; i < Size(); i++) {
            temp[i] = arr[i];
        }
        this.arr = temp;
    }

    public int Size() {
        return this.nel;
    }

    public String toString() {
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
