import React,{Component} from 'react';
import {ImageRequest, request} from '../../function';
// const Image = (props) =>{
//     var name = props.name;
//     var BaseData = '';
//     var imageExtanstion = name.split('.');
//     var setting = {
//         url:'http://localhost:8080/homeDekho/image',
//         requestType:'GET',
//         payload:{name:name}
//     }
//     function image(){
//         request(setting,(err,res)=>{
//         if(res){
//                 var json = JSON.parse(JSON.stringify(res));
//                 BaseData = json.data;
//                 return(<img src={`data:image/${imageExtanstion[1]};base64,${BaseData}`} />);
//             }
            
//         })
//     }
    
//     // console.log(props)
//     return(
//       <div>
//           <img src={`data:image/${imageExtanstion[1]};base64,${BaseData}`} />
//       </div>  
//     );
// }

class Image extends Component{
    state = {
        name:this.props.name,
        BaseData:'',
        imageExtanstion:this.props.name.split('.'),
        classdata:this.props.class
    }
    // var name = props.name;
    // var BaseData = '';
    componentWillMount(){
        var setting = {
            url:'http://localhost:8080/homeDekho/image',
            requestType:'GET',
            payload:{name:this.state.name}
        }
        request(setting,(err,res)=>{
        if(res){
                var json = JSON.parse(JSON.stringify(res));
                this.setState({BaseData:json.data});
            }
            
        })
    }
    render(){
        const {BaseData,imageExtanstion} = this.state;
        return(
            <div>
                <img className={this.state.classdata} src={`data:image/${imageExtanstion[1]};base64,${BaseData}`} />
            </div> 
        )
    }
}

export default Image;