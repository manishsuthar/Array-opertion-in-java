import React,{Component} from 'react';
import './index.css';
import {request} from "../../function";
class Contact extends Component{
    state = {
        name:'',
        phone:'',
        email:'',
        message:''
    }
    OnStateChange(key,event){
        switch (key) {
            case 'name':
                this.setState({name:event.target.value});
                break;
            case 'phone':
                this.setState({phone:event.target.value})
                break;
            case 'email':
                this.setState({email:event.target.value})
            break;
            case 'message':
                this.setState({message:event.target.value})
            break;
            default:
                break;
        }
    }
    submitClick = (event) =>{
        console.log(this.state)
        var setting = {
            url: 'http://localhost:8080/homeDekho/contectAdd',
            payload:this.state,
            requestType:'POST',
        }
        request(setting,(err,res)=>{
          alert(res.message)
        }) 
        event.preventDefault();
    }

    render(){
        const {name,email,phone,message} = this.state;
        return(
            <div>
                <div>
                    <h3>Contact Page</h3>
                    <div>
                        <form>
                            <table>
                                <tbody>
                                    <tr>
                                        <td className="text-right">Name</td>
                                        <td><input type="text" placeholder="Name" name="name" value={name} onChange={this.OnStateChange.bind(this,'name')}/></td>
                                    </tr>
                                    <tr>
                                        <td className="text-right">Email</td>
                                        <td><input type="email" placeholder="Email" name="email" value={email} onChange={this.OnStateChange.bind(this,'email')}/></td>
                                    </tr>
                                    <tr>
                                        <td className="text-right">Phone</td>
                                        <td><input type="number" placeholder="Phone" name="phone" value={phone} onChange={this.OnStateChange.bind(this,'phone')}/></td>
                                    </tr>
                                    <tr>
                                        <td className="text-right">Message</td>
                                        <td><textarea name="message" placeholder="Message" value={message} onChange={this.OnStateChange.bind(this,'message')}/></td>
                                    </tr>
                                    {/* <tr>
                                        <td>
                                            <center><button type="button" onClick={this.submitClick}>Submit</button></center>
                                        </td>
                                    </tr> */}
                                </tbody>
                            </table>
                            <center><button type="button" class="btn cyan mini" onClick={this.submitClick}>Submit</button></center>
                        </form>
                    </div>
                </div>
            </div>
        );
    }
}

export default Contact;