public class Assignment_DSA_1 {
    public static void main(String[] argc) {


        {
            System.out.println("HOLLOW RECTANGLE pattern ");
            int num = 5;
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < 5; j++) {
                    if (i == 0 || i == num - 1 || j == 0 || j == num - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  "); // spaces inside
                    }
                }
                System.out.println();
            }
        }


        {
            System.out.println("\nINVERTED & ROTATED HALF-PYRAMID pattern");
            int num_1 = 4;
            for (int i = 0; i <= num_1; i++) {
                for (int j = 0; j < 5; j++) {
                    int sum = i + j;
                    if (sum <= 3) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }


        {
            System.out.println("\nINVERTED HALF-PYRAMID with Numbers pattern");
            int num_2 = 5;

            for (int i = num_2; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }


        {
            System.out.println("\nFLOYD'S Triangle pattern");
            int num_3 = 5;
            int count = 1;

            for (int i = 1; i <= num_3; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(count + " ");
                    count++;
                }
                System.out.println();
            }
        }

        {
            System.out.print("\n0-1 Triangle pattern");
            int num_4 = 5;
            for (int i = 0; i <= num_4; i++) {
                for (int j = 0; j < i; j++) {
                    int sum = i + j;
                    if (sum % 2 == 0) {
                        System.out.print("0");
                    } else {
                        System.out.print("1");
                    }

                }
                System.out.println();
            }
        }


        {
            System.out.println("\nBUTTERFLY pattern");
            int num_5 = 5;
            for (int i = 1; i <= num_5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                for (int j = i; j < num_5; j++) {
                    System.out.print("  "); // double space for better symmetry
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = num_5; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                for (int j = i; j < num_5; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }


        {
            System.out.println("\nSOLID RHOMBUS pattern");
            int num_6 = 5;
            for (int i = 1; i <= num_6; i++) {
                // Spaces (shifting)
                for (int j = 1; j <= num_6 - i; j++) {
                    System.out.print(" ");
                }
                // Stars (fixed count)
                for (int j = 1; j <= num_6; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }


        {
            System.out.println("\nHollow Rhombus Pattern");
            int num_7 = 5;
            for (int i = 1; i <= num_7; i++) {
                for (int j = 1; j <= num_7 - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= num_7; j++) {
                    if (i == 1 || i == num_7 || j == 1 || j == num_7) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }


        {
            System.out.println("\nDIAMOND pattern");
            int num_8 = 5;
            for (int i = 1; i <= num_8; i++) {
                for (int j = 1; j <= num_8 - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = num_8 - 1; i >= 1; i--) {
                for (int j = 1; j <= num_8 - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }


        {
            System.out.println("\nNUMBER PYRAMID");
            int num_9 = 5;
            for (int i = 1; i <= num_9; i++) {

                for (int j = 1; j <= num_9 - i; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }

        }


        {
            System.out.println("\nPALINDROMIC Pattern with Numbers pattern");
            int num_10 = 5;

            for (int i = 1; i <= num_10; i++) {

                for (int j = 1; j <= num_10 - i; j++) {
                    System.out.print(" ");
                }


                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }


                for (int j = 2; j <= i; j++) {
                    System.out.print(j);
                }

                System.out.println();
            }
        }















    }
}