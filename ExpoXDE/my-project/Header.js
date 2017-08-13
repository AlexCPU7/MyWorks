import React, { Component } from 'react';
import { Text, View, StyleSheet, Image } from 'react-native';

export default class Header extends Component {
    render() {
        const {viewStale} = styles;
        return (
            <View style={viewStale}>
                <Image
                    style={styles.logo}
                    source={require('./logo.jpg')} 
                />
            </View>
        );
    }
}

const styles = StyleSheet.create({

    logo: {
        flex:1,
 
    },

    viewStale: {
        alignItems: 'center',
        justifyContent: 'center',

        height: 100,
    },
});