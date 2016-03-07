package org.action.extractrestAPI;

public class GetRestAPICommand{
		
		private String command;
		private String method;
		private String index;
		private String type;
		private String Id;
		
		public GetRestAPICommand(String param, String param2, String param3) {
			this.index=param;
			this.type=param2;
			this.Id=param3;
		}
		public GetRestAPICommand() {
			// TODO Auto-generated constructor stub
		}
		public void setIndex(String index)
		{
			this.index=index;
		}
		public String getIndex()
		{
			return this.index;
		}
		public void setType(String type)
		{
			this.type=type;
		}
		public String getType()
		{
			return this.type;
		}
		public void setId(String Id)
		{
			this.Id=Id;
		}
		public String getId()
		{
			return this.Id;
		}
		public void setMethod(String method)
		{
			this.method=method;
		}
		public String getMethod()
		{
			return this.method;
		}
		
		public void setcommand(String command)
		{
			this.command=command;
		}
		public String getcommand()
		{
			return this.command;
		}
		//WriteToFile write=new WriteToFile(command,"C:\\Users\\shaskumar\\Downloads\\commandfile.txt");
		
		
}


