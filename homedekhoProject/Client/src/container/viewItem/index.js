import React,{Component} from 'react';
import { request } from '../../function';
import './index.css';
import Image from '../../component/ImageGetting';
import OwlCarousel from 'react-owl-carousel2';
import 'react-owl-carousel2/lib/styles.css';
class View extends Component{
    state={data:{"date":"NONE","parking":true,"image3":"NONE.png","address":"234","image4":"NONE.jpg","city":"NONE",
                      "description":"NONE","ctphone":"NONE","type":"NONE","image1":"NONE.jpg","image2":"NONE.jpg",
                      "profileimage":"NONE.jpg","ctemail":"NONE","station":true,
                      "ctname":"NONE","id":"NONE","state":"NONE"},
            loaded:false
        }
    componentWillMount(){
        const id = this.props.match.params.id;
        var setting = {
            url:'http://localhost:8080/homeDekho/view',
            requestType:'GET',
            payload:{id:id}
        }
        request(setting,(err,res)=>{
            if(res){
                this.setState({data:res.data[0]});
                this.setState({loaded:true});
            }
        })
    }
    
    render(){
        const id = this.props.match.params.id;
        const options = { items: 1,nav: true,rewind: true,autoplay: true};
        const events = { onDragged: function(event) {},onChanged: function(event) {}};
        return(
            <div className="headerDiv">
               <div className="fullWidthSilder">
                  <OwlCarousel options={options} events={events} >
                    {
                           this.state.loaded && <Image class="sliderImage" name={this.state.data.image1}/>
                    }
                    {
                           this.state.loaded && <Image class="sliderImage" name={this.state.data.image2}/>
                    }
                    {
                           this.state.loaded && <Image class="sliderImage" name={this.state.data.image3}/>
                    }
                    {
                           this.state.loaded && <Image class="sliderImage" name={this.state.data.image4}/>
                    }
                 </OwlCarousel>
               </div>
               <div className="ViewMain">
                    <div className="leftDiv"> 
                       {
                           this.state.loaded && <Image class="Listimg1" name={this.state.data.profileimage}/>
                       }
                        
                    </div>
                    <div className="rightDiv">
                        <table>
                            <tbody>
                                <tr>
                                    <td className="pull-right">
                                    <b>Posted Date</b><b>{this.state.data.date}</b> 
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <p className="pull-left"><b>Address</b>{this.state.data.address}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <p className="pull-left"><b>City</b>{this.state.data.city}</p>
                                    </td>
                                    <td>
                                        <p className="pull-left"><b>State</b>{this.state.data.state}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <p  className="pull-left"><b>Type</b>{this.state.data.type}</p>
                                    </td>
                                    <td>
                                        <p  className="pull-left"><b>Parking</b>{`${this.state.data.parking ? 'YES' :'NO'}`}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <p className="pull-left"><b>Description</b>{this.state.data.description}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td className="pull-left"><p><b>Price</b> &#8377; {this.state.data.price}</p></td>
                                    <td>
                                        <p  className="pull-left"><b>Near Station</b>{`${this.state.data.station ? 'YES' :'NO'}`}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Contact Details</td>
                                </tr>
                                <tr>
                                    <td><p className="pull-left"><b>Name</b>{this.state.data.ctname}</p></td>
                                    <td><p className="pull-left"><b>Phone</b>{this.state.data.ctphone}</p></td>
                                </tr>
                                <tr>
                                    <td><p className="pull-left"><b>Email</b>{this.state.data.ctemail}</p></td>
                                    {/* <td><p className="pull-left"><b>Phone</b>{this.state.data.ctphone}</p></td> */}
                                </tr>
                            </tbody>
                        </table>
                    </div>
               </div>
            </div>
        );
    }
}

export default View;