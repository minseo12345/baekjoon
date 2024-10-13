class Solution {
    public String solution(int[] numbers) {
        // 숫자를 문자열 배열로 변환
        String[] a = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            a[i] = String.valueOf(numbers[i]);
        }

        // 퀵 정렬을 사용하여 문자열 정렬
        quickSort(a, 0, a.length - 1);

        // 모든 값이 0인 경우, '0'만 반환
        if (a[0].equals("0")) return "0";

        // 정렬된 문자열을 하나로 합침
        StringBuilder answer = new StringBuilder();
        for (String num : a) {
            answer.append(num);
        }

        return answer.toString();
    }

    private void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // 두 문자열을 이어 붙였을 때 더 큰 순서대로 비교
            if ((arr[j] + pivot).compareTo(pivot + arr[j]) > 0) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
