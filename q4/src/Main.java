import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
                    if (args.length != 2)
                    {
                        System.out.println("Invalid arguments.");
                        System.exit(1);
                    }

                    File text = new File(args[1]);
                    if (text.exists()==false)
                    {
                        System.out.println(args[1] + " Doesn't exist");
                        System.out.println(2);
                    }
                    String Z = null;
                    try
                    {
                        Scanner in = new Scanner(text);
                        while (in.hasNext())
                        {
                            Z += in.nextLine();
                        }
                    } catch (FileNotFoundException f)
                    {
                        System.out.println(f);
                    }
                    Z = Z.replaceAll(args[0], null);
                    try
                    {
                        PrintWriter out = new PrintWriter(text);
                        out.write(Z);
                        out.close();
                    } catch (FileNotFoundException f)
                    {
                        System.out.println(f);
                    }
                }
            }