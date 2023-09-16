# WaterTrapping
in this problem we two pointer 
left and right
firstly we compare is(left < right){
  if left is min
  then we compare leftMax to arr[left] if leftMax < arr[left] we update leftMax by arr[left] and leftMax initially 0
  else
  trappedWater = leftMax - arr[left] // arr[left] is current height at left side
  left++;
}
else{
  if right is min
   then we compare rightMax to arr[right] if rightMax < arr[right] we update rightMax by arr[right] and rightMax initially 0
  
  else
  trappedWater = rightMax - arr[right] // arr[right] is current height at right side
  right--;
}
