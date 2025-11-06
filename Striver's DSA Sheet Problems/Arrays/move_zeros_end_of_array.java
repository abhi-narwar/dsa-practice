class move_zeros_end_of_array {

    void pushZerosToEnd(int[] arr) {
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[j++] = arr[i];
            }
        }
        while(j < arr.length){
            arr[j++] = 0;
        }
    }
}
