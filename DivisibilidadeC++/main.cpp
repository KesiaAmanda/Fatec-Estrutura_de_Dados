/*************************************************/
/* Aluno: Kesia Amanda Ladeia RA: 1110481822053 */
/* UC: Estrutura de Dados */
/* Prof. Eliane */
/************************************************/

#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <math.h>

bool validaDivisor(int divisor);
bool validaDividendo(int dividendo);
void imprimirObjetivoLab();
bool testarDivisibilidade(int dividendo, int divisor);
bool divisibilidade2(int dividendo);
bool divisibilidade3(int dividendo);
bool divisibilidade4(int dividendo);
bool divisibilidade5(int dividendo);
bool divisibilidade6(int dividendo);
bool divisibilidade7(int dividendo);
bool divisibilidade8(int dividendo);
bool divisibilidade9(int dividendo);
bool divisibilidade10(int dividendo);
bool divisibilidade11(int dividendo);
bool divisibilidade12(int dividendo);
bool divisibilidade15(int dividendo);
bool divisibilidade25(int dividendo);
bool validaEntrada(char entrada);


int main(void) {
	bool valido = true;
	int dividendo, divisor;
	imprimirObjetivoLab();
	
	while(valido){
		dividendo=0;
		
		while(!validaDividendo(dividendo)){
			printf("Informe um dividendo:\n");
			scanf("%i", &dividendo);
			divisor=0;
			if (!validaDividendo(dividendo)) printf("Dividendo invalido! Favor informar novos valores.");
		}
		
		while(!validaDivisor(divisor)){
			printf("Informe um divisor:\n");
			scanf("%i", &divisor);
			if(!validaDivisor(divisor)) printf("Divisor invalido! Favor informar novos valores.");
		}
		
		if(testarDivisibilidade(dividendo, divisor)) printf("%i e divisivel por %i\n", dividendo, divisor);
		else printf("%i nao e divisivel por %i\n", dividendo, divisor);
		
		char entrada = 'x';
		
		while(!validaEntrada(entrada)){
			printf("\nDeseja realizar novo teste (s/n)?\n");
			fflush(stdin);
			scanf("%c", &entrada);
			
			if (entrada=='n'||entrada=='N') return 0;
			
			if (!validaEntrada(entrada)) printf("Entrada ''%c'' e invalida\n", entrada);
		}
	}
	return 0;
}

bool validaEntrada(char entrada){
	return entrada=='s'||entrada=='S'||entrada=='n'||entrada=='N';
}

void imprimirObjetivoLab(){
	printf("Programa TESTE DE DIVISIBILIDADE\n\nO programa tem por objetivo informar se um determinado\n");
	printf("numero eh ou nao divisivel por outro.\n\nOs testes de divisibilidade sao validos para os ");
	printf("seguintes\ndivisores: 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15 e 25.\n\n");
}


bool validaDivisor(int divisor){
	return (divisor>=2&&divisor<=12)||divisor==15||divisor==25;
}

bool validaDividendo(int dividendo){
	return dividendo>0;
}

bool testarDivisibilidade(int dividendo, int divisor){
	if(divisor==2) return divisibilidade2(dividendo);
	if(divisor==3) return divisibilidade3(dividendo);
	if(divisor==4) return divisibilidade4(dividendo);
	if(divisor==5) return divisibilidade5(dividendo);
	if(divisor==6) return divisibilidade6(dividendo);
	if(divisor==7) return divisibilidade7(dividendo);
	if(divisor==8) return divisibilidade8(dividendo);
	if(divisor==9) return divisibilidade9(dividendo);
	if(divisor==10) return divisibilidade10(dividendo);
	if(divisor==11) return divisibilidade11(dividendo);
	if(divisor==12) return divisibilidade12(dividendo);
	if(divisor==15) return divisibilidade15(dividendo);
	if(divisor==25) return divisibilidade25(dividendo);
	else return false;
}

bool divisibilidade2(int dividendo){
	dividendo=dividendo%10;
	return dividendo==0||dividendo==2||dividendo==4||dividendo==6||dividendo==8;
}

bool divisibilidade3(int dividendo){
	int aux=0;
	
	while(dividendo>0){
		aux+=dividendo%10;
		dividendo=dividendo/10;
	}
	
	if(aux>10) return divisibilidade3(aux);
	
	return aux==3||aux==6||aux==9;
}

bool divisibilidade4(int dividendo){
	return divisibilidade2(dividendo)&&divisibilidade2(dividendo/2);
}

bool divisibilidade5(int dividendo){
	dividendo=dividendo%10;
	return dividendo==0||dividendo==5;
}

bool divisibilidade6(int dividendo){
	return divisibilidade2(dividendo)&&divisibilidade3(dividendo);
}

bool divisibilidade7(int dividendo){
	int tabuada7[] = {0, 7, 14, 21, 28, 35, 42, 49, 54, 63, 70};
	
	while(dividendo>70){
		int aux = (dividendo%10)*2;
		dividendo = fabs((dividendo/10)-aux);
	}
	
	for(int i=0;i<=10;i++){
		if(dividendo==tabuada7[i]) return true;
	}
	
	return false;
}

bool divisibilidade8(int dividendo){
	return divisibilidade2(dividendo)&&divisibilidade2(dividendo/2)&&divisibilidade2((dividendo/2)/2);
}

bool divisibilidade9(int dividendo){
	return divisibilidade3(dividendo)&&divisibilidade3(dividendo/3);
}

bool divisibilidade10(int dividendo){
	return dividendo%10==0;
}

bool divisibilidade11(int dividendo){
	int Si=0, Sp=0, aux=0;
	
	while(dividendo>0){
		if(aux==0){
			Si+=dividendo%10;
			aux=1;
		}else{
			Sp+=dividendo%10;
			aux=0;
		}
		dividendo/=10;
	}
	
	dividendo=fabs(Si-Sp);
	
	if(dividendo>9) return divisibilidade11(dividendo);
	
	return dividendo==0;
}

bool divisibilidade12(int dividendo){
	return divisibilidade3(dividendo)&&divisibilidade4(dividendo);
}

bool divisibilidade15(int dividendo){
	return divisibilidade3(dividendo)&&divisibilidade5(dividendo);
}

bool divisibilidade25(int dividendo){
	return divisibilidade5(dividendo)&&divisibilidade5(dividendo/5);
}
