import React,{Component} from 'react';
import List from '../../component/listView';
import {request} from '../../function';
class Search extends Component{
    state = {
        search:'',
        data:[]
    }
    OnSearchChange=(event)=>{
        this.setState({search:event.target.value});
    }
    SearchClick=(event)=>{
        console.log(this.state)
        var setting = {
            url: 'http://localhost:8080/homeDekho/Search',
            payload: {search:this.state.search},
            requestType: 'GET',
        }
        request(setting, (err, res) => {
            if(res.success){
                alert(res.message);
                var newJson = res.data;
                this.setState({data:newJson});
                console.log(this.state)
            }
        })
        event.preventDefault();
    }
    render(){
        const {search,data} = this.state;
        return(
            <div>
                <div>
                    <h3>Search Page</h3>
                </div>
                <div className="inlineSearch">
                    <form onSubmit={this.SearchClick}>
                       <input type="text" placeholder="Search" name="search" value={search} onChange={this.OnSearchChange}/> 
                       <button class="btn cyan mini" type="submit" name="submit">Submit</button>
                    </form>
                </div>
                <div className = "headerDiv" >
                    <List data={data}/> 
                </div>
            </div>
        );
    }
}

export default Search;