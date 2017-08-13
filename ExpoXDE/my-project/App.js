import React, { Component } from 'react';
import { 
    AppRegistry, 
    Image, 
    StyleSheet,
    Text, 
    View, 
    TextInput,
    TouchableOpacity,
    Navigator,
} from 'react-native';

import Header from './Header';
import Mid from './Mid';
    import MyScene from './MyScene';

export default class App extends Component {
    state = {
        name1: '',
        name2: '',
        name3: '',
    };
    render() {

        const {viewStale, textStale} = styles;
        
        return (
            <View style={viewStale}>
                <Header />
                <Mid />

                <TextInput 
                    style={styles.nameInput}
                    placeholder='Ваш E-mail'
                    onChangeText={(text) => {
                        this.setState({name1: text,});
                    }}
                    value={this.state.name}
                />
                <TextInput 
                    style={styles.nameInput}
                    placeholder='Ваш номер телефона'
                    onChangeText={(text) => {
                        this.setState({name2: text,});
                    }}
                    value={this.state.name}
                />
                <TextInput 
                    style={styles.nameInput}
                    placeholder='Ваше сообщение'
                    onChangeText={(text) => {
                        this.setState({name3: text,});
                    }}
                    value={this.state.name}
                />

                <TouchableOpacity
                    style={styles.buttonOblast}
                    onPress={() => {
                        alert(
                             "Ваш E-mail: " + this.state.name1 + "\r\nВаш номер телефона: " + this.state.name2 + "\r\nВаше сообщение: " + this.state.name3
                        )
                    }}
                    >
                    <Text style={styles.buttonText}>
                        Отправить
                    </Text>
                </TouchableOpacity>

            </View>

        );
    }
}

const styles = StyleSheet.create({
    viewStale: {
        flex: 1,
        padding: 25,
        backgroundColor: '#3498db',
    },
    nameInput: {
        height: 40,
        padding: 5,
        borderWidth: 2,
        borderColor: 'black',
        margin: 10,
        backgroundColor: 'rgba(255,255,255,0.2)',
    },
    buttonOblast: {
        alignItems: 'center',
        justifyContent: 'center',
        backgroundColor: 'black',
        height: 40,
        width: 120,
        margin: 10,
        borderRadius: 8,
    },

    buttonText: {
        fontSize: 18,
        color: '#fff',
    },
});

AppRegistry.registerComponent('App', () => App);
