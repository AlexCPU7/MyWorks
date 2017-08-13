import React, { Component } from 'react';
import { Text, View, StyleSheet, Animated } from 'react-native';

class Mid extends Component {

    render() {
        const {viewStale, styleTextElement, styleTextHeader, styleTextSubtitle, styleTextPrice, styleMargin} = styles;
        
        return (
        <View>
            <View style={styleMargin}> 
                <Text style={styleTextElement}> Элемент1 </Text>
                <View style={viewStale}> 
                    <Text style={styleTextHeader}> Заголовок: элемента 1 </Text>
                    <Text style={styleTextSubtitle}> Подзаголовок: краткое описание 1 </Text>
                    <Text style={styleTextPrice}> Цена: 1$ </Text>
                </View>
            </View>
        </View>
        );
    }
}

const styles = StyleSheet.create({
    styleMargin: {
        margin: 10, 
    },
    viewStale: {
        alignItems: 'center',
        justifyContent: 'center',
        borderWidth: 2,
        borderColor: 'black',
    },
    styleTextElement: {
        fontSize: 36,
        color: 'black',
        borderWidth: 2,
        borderColor: 'black',
    },
    styleTextHeader: {
        fontSize: 25,
        color: 'black',
    },
    styleTextSubtitle: {
        fontSize: 22,
        color: 'black',
    },
    styleTextPrice: {
        fontSize: 22,
        color: 'black',
    },
});

export default Mid;