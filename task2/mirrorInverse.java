import java.util.*;
class mirrorInverse{

    // Function that returns true if
    // the array is mirror-inverse
    static boolean isMirrorInverse(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {

            // If condition fails for any element
            if (arr[arr[i]] != i)
                return false;
        }

        // Given array is mirror-inverse
        return true;
    }

    public static void main(String[] args)
    {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arrays Element::");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        if (isMirrorInverse(arr))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}