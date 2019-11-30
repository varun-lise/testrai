package all;

public class IntegrationAPI {
//
//    /**
//     * Use to get particular test case
//     */
//
//    @Test
//
//    public  void  get_Case() throws Exception
//    {
//        APIClient client = new APIClient("https://chaitanya1992.testrail.io/");
//        client.setUser("chetanya1992@gmail.com");
//        client.setPassword("Chaitanya1992");
//
//        JSONObject c = (JSONObject) client.sendGet("get_case/6");
//        System.out.println(c.toString());
//
//    }
//
//    /**
//     * Use to get all cases from particular suite
//     * get_cases/3&suite_id=2 ---- 3 is project id and 2 is test suite id
//     */
//
//    @Test
//    public  void  get_All_Cases() throws Exception
//    {
//        APIClient client = new APIClient("https://chaitanya1992.testrail.io/");
//        client.setUser("chetanya1992@gmail.com");
//        client.setPassword("Chaitanya1992");
//
//        JSONArray c = (JSONArray) client.sendGet("get_cases/3&suite_id=2");
//
//        System.out.println(c.toString());
//
//    }
//
//    /*
//     * Use to get all cases from particular suite
//     * add_run/3 ---- 3 is project id
//     */
//
//    @Test
//    public  void  add_Run() throws Exception
//    {
//        APIClient client = new APIClient("https://chaitanya1992.testrail.io/");
//
//        client.setUser("chetanya1992@gmail.com");
//        client.setPassword("Chaitanya1992");
//
//        Map<String, Object> data = new HashMap<String, Object>();
//                    data.put("name","Add Run From Java ");
//                    data.put("milestone_id",1);
//                  data.put("case_ids",new int[]{6,10,13});
//                    data.put("suite_id",2);
//                    data.put("inculde_all",false);
//                    data.put("status",1);
//
//        System.out.println(data+"...s");
//        JSONObject c = (JSONObject) client.sendPost("add_run/3",data);
//
//        System.out.println(c.toString());
//
//    }
//
//    /**
//     * Use to get all cases from particular suite
//     * add_result_for_case/25/7---- 25 is run id and 7 is case id.
//     * status_id , 1 for passed
//     */
//
//    @Test
//    public  void  update_Run() throws Exception
//    {
//        APIClient client = new APIClient("https://chaitanya1992.testrail.io/");
//        client.setUser("chetanya1992@gmail.com");
//        client.setPassword("Chaitanya1992");
//
//        Map<String, Object> data = new HashMap<String, Object>();
//        data.put("status_id", new Integer(1));
//        data.put("comment", "This test worked fine!");
//        JSONObject r = (JSONObject) client.sendPost("add_result_for_case/31/7", data);
//
//        System.out.println(r.toString());
//
//    }
//
//    @Test
//    public  void  add_Run_passed_Status() throws Exception
//    {
//        APIClient client = new APIClient("https://chaitanya1992.testrail.io/");
//
//        client.setUser("chetanya1992@gmail.com");
//        client.setPassword("Chaitanya1992");

//        Map<String, Object> data = new HashMap<String, Object>();
//        data.put("name","Run with passed status");
//        data.put("milestone_id",1);
//        data.put("case_ids",new int[]{6,7,9});
//        data.put("suite_id",2);
//        data.put("inculde_all",false);
//        data.put("status_id", new Integer(1));
//        data.put("comment", "This test worked fine!");

//
//        String jsonTest="{\n" +
//                "    \"suite_id\": 2,\n" +
//                "    \"name\": \"test run123\",\n" +
//                "    \"include_all\": false,\n" +
//                "    \"case_ids\": [6,7] ,\n" +
//                "    \"milestone_id\": 1\n" +
//                "}";
//        System.out.println(jsonTest+"...s");
//        JSONObject c = (JSONObject) client.sendPost("add_run/3",jsonTest);
//
//        System.out.println(c.toString());
//
//    }
//
//    /**
//     * Use to get all cases from particular suite
//     *get_Run/25---- 25 is run id
//     */
//
//    @Test
//    public  void  get_Run() throws Exception
//    {
//        APIClient client = new APIClient("https://chaitanya1992.testrail.io/");
//        client.setUser("chetanya1992@gmail.com");
//        client.setPassword("Chaitanya1992");
//
//        JSONObject r = (JSONObject) client.sendGet("get_Run/25");
//
//        System.out.println(r.toJSONString());
//
//    }
//
//    /**
//     * Use to get all cases from particular suite
//     *get_Run/30---- 30 is run id
//     */
//
//    @Test
//    public  void  delete_Run() throws Exception
//    {
//        APIClient client = new APIClient("https://chaitanya1992.testrail.io/");
//        client.setUser("chetanya1992@gmail.com");
//        client.setPassword("Chaitanya1992");
//
//        JSONObject r = (JSONObject) client.sendPost("delete_run/31","");
//
//        System.out.println(r.toJSONString());
//
//    }
//
//    /**
//     * Use to get all cases from particular suite
//     *get_Run/31---- 31 is run id
//     */
//
//    @Test
//    public  void  updated_Run() throws Exception
//    {
//        APIClient client = new APIClient("https://chaitanya1992.testrail.io/");
//        client.setUser("chetanya1992@gmail.com");
//        client.setPassword("Chaitanya1992");
//
//        Map<String, Object> data = new HashMap<String, Object>();
//
//        data.put("case_ids",new int[]{6,7,9});
//
//        data.put("inculde_all",false);
//
//        JSONObject r = (JSONObject) client.sendGet("get_Run/31");
//
//        System.out.println(r.toJSONString());
//
//    }
//
//    /**
//     * Use to get all cases from particular suite
//     *get_Run/31/6---- 31 is run id and 6 is case id
//     */
//
//    @Test
//    public  void  updated_Run_Results() throws Exception
//    {
//        APIClient client = new APIClient("https://chaitanya1992.testrail.io/");
//        client.setUser("chetanya1992@gmail.com");
//        client.setPassword("Chaitanya1992");
//
//        Map<String, Object> data = new HashMap<String, Object>();
//        data.put("status_id",1);
//        data.put("comment","This test pass");
//
//        JSONObject r = (JSONObject) client.sendPost("add_result_for_case/31/6",data);
//
//        System.out.println(r.toJSONString());
//
//    }
//
//
//    @Test
//    public  void  get_results_for_run() throws Exception
//    {
//        APIClient client = new APIClient("https://chaitanya1992.testrail.io/");
//        client.setUser("chetanya1992@gmail.com");
//        client.setPassword("Chaitanya1992");
//
//        Map<String, Object> data = new HashMap<String, Object>();
//        data.put("status_id",1);
//        data.put("comment","This test pass");
//
//        JSONArray r = (JSONArray) client.sendGet("get_results_for_run/31");
//
//        System.out.println(r.toJSONString());
//
//    }
//
//    /**
//     * Use to get all about status ids
//     */
//
//    @Test
//    public  void  get_Statuses() throws Exception
//    {
//        APIClient client = new APIClient("https://chaitanya1992.testrail.io/");
//        client.setUser("chetanya1992@gmail.com");
//        client.setPassword("Chaitanya1992");
//
//        JSONArray r = (JSONArray) client.sendGet("get_statuses");
//
//        System.out.println(r.toJSONString());
//
//    }
//
//    /**
//     * Use to get project reports
//     */
//
//    @Test
//    public  void  get_Reports() throws Exception
//    {
//        APIClient client = new APIClient("https://chaitanya1992.testrail.io/");
//        client.setUser("chetanya1992@gmail.com");
//        client.setPassword("Chaitanya1992");
//
//        JSONArray r = (JSONArray) client.sendGet("get_reports/1");
//
//        System.out.println(r.toJSONString());
//
//    }
//
//    /**
//     * Use to get project reports
//     * delete_case/15 --- 15 is case id
//     */
//
//    @Test
//    public  void  delete_case() throws Exception
//    {
//        APIClient client = new APIClient("https://chaitanya1992.testrail.io/");
//        client.setUser("chetanya1992@gmail.com");
//        client.setPassword("Chaitanya1992");
//
//        JSONObject r = (JSONObject) client.sendPost("delete_case/15","");
//
//        System.out.println(r.toJSONString());
//
//    }
//
//    /**
//     * Use to get project reports
//     * get_configs/3 --- 3 is project id
//     */
//
//    @Test
//    public  void  get_configs() throws Exception
//    {
//        APIClient client = new APIClient("https://chaitanya1992.testrail.io/");
//        client.setUser("chetanya1992@gmail.com");
//        client.setPassword("Chaitanya1992");
//
//        JSONArray r = (JSONArray) client.sendGet("get_configs/3");
//
//        System.out.println(r.toJSONString());
//
//    }

}