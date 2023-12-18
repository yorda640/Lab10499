

public class HotelReservationSystem {
    private TreeNode root;

    public HotelReservationSystem() {
        root = null;
    }

    public void reserveRoom(int roomNumber, String guestName) {
        root = insertRec(root, new HotelRoom(roomNumber, guestName));
    }

    private TreeNode insertRec(TreeNode root, HotelRoom room) {
        if (root == null) {
            root = new TreeNode(room);
            return root;
        }

        if (room.roomNumber < root.room.roomNumber) {
            root.left = insertRec(root.left, room);
        } else if (room.roomNumber > root.room.roomNumber) {
            root.right = insertRec(root.right, room);
        }

        return root;
    }

    public boolean searchReservation(int roomNumber) {
        return searchRec(root, roomNumber);
    }

    private boolean searchRec(TreeNode root, int roomNumber) {
        if (root == null) {
            return false;
        }

        if (roomNumber == root.room.roomNumber) {
            return true;
        } else if (roomNumber < root.room.roomNumber) {
            return searchRec(root.left, roomNumber);
        } else {
            return searchRec(root.right, roomNumber);
        }
    }

    public void displayReservations() {
        inorderTraversalRec(root);
    }

    private void inorderTraversalRec(TreeNode root) {
        if (root != null) {
            inorderTraversalRec(root.left);
            System.out.println("Room Number: " + root.room.roomNumber + ", Guest Name: " + root.room.guestName);
            inorderTraversalRec(root.right);
        }
    }

}