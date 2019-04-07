
class prototype
{
        static ServerTCP server;
        static Thread t;
        public static void main(String args[])
        {
                //the server Thread is initialized
                server = new ServerTCP();
                t = new Thread(server);
        }
};

class DerverTCP implements Runnable
{
        int PORT1;
        static ClientTCP client;
        static Thread t;
        ServerSocket server;
        Socket s;
        ServerTCP(int port)
        {
                //starting the server of in this computer
                server = new ServerSocket(PORT1)
                //as the server has started functioning
                client = new ClientTCP();
                t = new Thread(client);
        }
};
class ClientTCP implements Runnable
{
        Socket client;
        ClientTCP()
        {
                client
        }
};
