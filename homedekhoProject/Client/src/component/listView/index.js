import React from 'react';
import './index.css';
import {Link} from 'react-router-dom';
import config from '../../config';
import Image from '../../component/ImageGetting';
const ListItems = (listData)=>{
    const list = listData.list;
    return(
        <div>
           <div className="listMain">
                <div className="leftImage">
                    {/* <img src={`data:image/png;base64, /${config.baseurl+'/image/?name='+list.profileimage}`} alt="listImage" className="ListViewImage" /> */}
                    <Image class="Listimg" name={list.profileimage} />
                </div>
                <div className="rightImage">
                    <table>
                        <tbody>
                            <tr>
                                <td className="pull-right">
                                   <b>Posted Date</b><b>{list.date}</b> 
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <p className="pull-left"><b>Address</b>{list.address}</p>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <p className="pull-left"><b>City</b>{list.city}</p>
                                </td>
                                <td>
                                    <p className="pull-left"><b>State</b>{list.state}</p>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <p className="pull-left"><b>Description</b>{list.description}</p>
                                </td>
                            </tr>
                            <tr>
                                <td><p className="pull-left"><b>Price</b>{list.price}</p></td>
                                <td>
                                    <Link className="viewBtn" to={`/view/${list.id}`}>View</Link>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
           </div>
        </div>
    );
}

const List = (props) =>{
    return(
        <div>
           <div className="list-group">
                {  props.data.map(data=>(
                    <ListItems list={data} key={data.id}/>
                ))}
            </div> 
        </div>
    );
}

export default List;