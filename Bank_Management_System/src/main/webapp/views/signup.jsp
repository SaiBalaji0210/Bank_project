<style>
    body{
        background: url(https://st4.depositphotos.com/11522418/41221/i/450/depositphotos_412211878-stock-photo-bank-leaning-red-wall-rendering.jpg);
        background-repeat: no-repeat;
        background-size: cover;
    }
    body form{
        text-align: center;
        font-size: large;
    }
    body h1{
        text-align: center;
        font-family: 'Times New Roman', Times, serif;
        color: white;
        
    }
    body a{
        text-align: center;
        text-decoration: none;
        color: white;
        font-size: large;
        font-family: Arial, Helvetica, sans-serif;
    }
    body a:hover{
        color: grey;
    }
</style>
<body> 
    <h1><b>CREATE ACCOUNT..</b></h1>
    <form action="/save"  class="form">
        Account Number:<input type="number" name="accountno" ><br><br>
       Name: <input type="text" name="name"><br><br>
        Password:<input type="password" name="password"><br><br>
        Confirm Password:<input type="password" name="confirmpassword"><br><br>
        Amount:<input type="number" name="amount"><br><br>
        Mobile Number:<input type="number" name="mobileno"><br><br>
        <input type="submit" value="create Account"><br><br>
    </form>
    <a href="/">Back To Home Page</a>
</body>