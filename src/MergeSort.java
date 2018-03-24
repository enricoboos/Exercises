
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Write your code here
		  int[] array1 = {1,2,3,4};
		  int[] array2= {2,5,7,8};
		  int length= array1.length + array2.length;
		  int[] result = new int[length];
		  //merge arrays
		  for(int i=0; i<length;i++){
		    if(i<array1.length){
		      result[i]=array1[i];
		    }
		    else{
		      result[i]=array2[i-array1.length];
		    }
		  }
		  //sort new array
		  for(int i=0;i<length;i++){
		    for(int j=i+1;j<length;j++){
		      int c=0;
		      if(result[i]>result[j]){
		        c=result[i];
		        result[i]=result[j];
		        result[j]=c;

		      }
		    }
		  }
		  
		  for(int i=0; i<length;i++){
		    System.out.println(result[i]);
		  }
	}

}
