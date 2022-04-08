package pi2;

import java.util.Random; 

import java.util.Scanner;

public class PI2 {

static Random ran = new Random();

static Scanner entrada = new Scanner(System.in);

static int [] embaralhar (int vetor[]){
   
   for(int i = 0; i < vetor.length; i++){
   
  int j = ran.nextInt(vetor.length);
   
   int temp = vetor[i];
     vetor[i] = vetor[j];
     vetor[j] = temp;
   }
   
   return vetor;
 }


static String [] embaralhadordeString (String vetor[]){
   
   for(int i = 0; i < vetor.length; i++){
   
  int j = ran.nextInt(vetor.length);
   
   String temp = vetor[i];
     vetor[i] = vetor[j];
     vetor[j] = temp;
   }
   
   return vetor;
 }


// ---------------- DIFICULDADE 1 FUNÇÕES PERGUNTAS ---------‐

static int D1pergunta1 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Pico da Neblina.","Pico paraná.","Monte Roraima.","Pico Maior de Friburgo.","Pico da Bandeira."};
  
  System.out.println("Qual a montanha mais alta do Brasil ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Pico da Neblina.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  
  
  static int D1pergunta2 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Neolítico.","Paleolítico.","Idade dos Metais.","Período da Pedra Polida.","Idade Média."};
  
  System.out.println("Em que período da pré - história o fogo foi descoberto ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Paleolítico.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D1pergunta3 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Tem entre 2 a 4 litros. São retirados 450 mililitros.","Tem entre 4 a 6 litros. São retirados 450 mililitros.","Tem 10 litros. São retirados 2 litros.","Tem 7 litros. São retirados 1,5 litros.","Tem 0,5 litros.São retirados 0,5 litros."};
  
  System.out.println("Normalmente, Quantos litros de sangue uma pessoa tem ? Em média, quantos são retirados numa doaçao se sangue ?");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Tem entre 4 a 6 litros. São retirados 450 mililitros.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  
  static int D1pergunta4 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"França.","Inglaterra.","Brasil.","Australia.","Italia."};
  
  System.out.println("De onde é a invenção do chuveiro elétrico ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Brasil.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  
   static int D1pergunta5 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"8.","10.","9.","5.","7."};
  
  System.out.println("Qual o número mínimo de jogadores numa partida de futebol ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("7.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
   static int D1pergunta6 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Asterístico, beneficiente,meteorologia,entretido.","Asterisco, beneficente, meteorologia, entretido.","Asterisco, beneficente, metereologia, entretido.","Asterístico, beneficiente, metereologia, entretido.","Asterisco, beneficiente, metereologia, entretido."};
  
  System.out.println("Qual é o grupo em que todas as palavras foram escritas corretamente ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Asterisco, beneficente, meteorologia, entretido.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  
  static int D1pergunta7 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"No século X.","No século XI.","No século XII.","No século XIII.","No século XIV."};
  
  System.out.println("Em que século o continente europeu foi devastado pela peste bubônica ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("No século XIV.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D1pergunta8 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"113.","109.","108.","118.","92."};
  
  System.out.println("Atualmente,quantos elementos químicos a tabela periódica possui ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("118.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  
  static int D1pergunta9 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Vaticano e Rússia.","Nauru e China.","Mônaco e Canadá.","Malta e Estados Unidos.","São Marino e India."};
  
  System.out.println("Quais o menor e o maior país do mundo ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Vaticano e Rússia.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D1pergunta10 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Jânio Quadros.","Jacinto Anjos.","Getúlio Vargas.","João Figueiredo.","João Goulart."};
  
  System.out.println("Qual o nome do presidente do Brasil que ficou conhecido como Jango ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("João Goulart.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D1pergunta11 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"O senhor dos Aneis.","Dom Quixote.","O Pequeno Príncipe.","Ela ,a Feiticeira.","Um Conto de Duas Cidades."};
  
  System.out.println("Qual o livro Mais vendido do mundo a seguir da Bíblia ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Dom Quixote.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D1pergunta12 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Independência do Brasil e Dia da Bandeira.","Proclamação da República e Dia Nacional da Consciência Negra.","Dia do Médico e dia de São Lucas.","Dia de Finados e Dia Nacional do livro.","Black Friday e Dia da Arvores."};
  
  System.out.println("Quais as duas datas que são comemoradas em novembro ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Proclamação da República e Dia Nacional da Consciência Negra.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D1pergunta13 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"O pavão.","A garça.","O papagaio.","A cacatua.","O peru."};
  
  System.out.println("Que animal gruguleja ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("O peru.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D1pergunta14 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"veias.","átrios.","ventrículos.","artérias.","aurículos."};
  
  System.out.println("Como se chama os vasos que transportam sangue do coração para a periferia do corpo ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("artérias.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D1pergunta15 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Torre Eiffel.","Petit Palais.","Grand Palais.","Museu do Louvre.","Arco do Triunfo."};
  
  System.out.println("No exterior de que famoso Edifício francês foi construída uma enorme pirâmide de vidro em 1989 ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Museu do Louvre.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D1pergunta16 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"12 minutos.","1 dia.","12 horas.","8 minutos.","1 segundo."};
  
  System.out.println("Quanto tempo a luz do sol demora para chegar à Terra ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("8 minutos.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  
  static int D1pergunta17 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Com o Brasil e com a Colômbia.","Com a Colômbia e com a Venezuela.","Com a Colômbia e com o Peru.","Com o Peru e com o Equador.","Com o Equador e o Brasil."};
  
  System.out.println("Com que dois países faz fronteiras o Equador ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Com a Colômbia e com o Peru.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  
  static int D1pergunta18 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Cubana.","Peruana.","Panamenha.","Boliviana.","Argentina."};
  
  System.out.println("Qual a nacionalidade de Che Guevara ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Argentina.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D1pergunta19 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"2,4 para ambos.","2,5m e 2,0m.","1,8m e 1,5m.","2,45m e 2,15m.","2,43m e 2,24m."};
  
  System.out.println("Qual a altura da rede de vôlei nos jogos masculino e feminino ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("2,43m e 2,24m.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D1pergunta20 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Bandeira insígnia da presidência, bandeira nacional, brasão, hinos e selo.","Bandeira Nacional, armas nacionais, hino nacional e selo nacional.","Bandeira Nacional, brasão, hino nacional e hino da independência.","Bandeira Nacional, cores nacionais ,hino nacional e hino da independência.","Bandeira insígnia da presidência, brasão flora e fauna e hinos."};
  
  System.out.println("Qual das alternativas menciona apenas símbolos nacionais ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Bandeira Nacional, armas nacionais, hino nacional e selo nacional.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D1pergunta21 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Terra, Vênus, Saturno, Urano, Júpiter, Marte, Netuno, Mercúrio.","Júpiter, Marte, Mercúrio, Netuno, Plutão, Saturno, Terra, Urano, Vênus.","Vênus, Saturno, Urano, Júpiter, Marte, Netuno, Mercúrio.","Júpiter, Marte, Mercúrio, Netuno, Plutão, Saturno, Sol, Terra, Urano, Vênus.","Terra, Vênus, Saturno, Júpiter, Marte, Netuno, Mercúrio."};
  
  System.out.println("Quais os planetas do sistema solar ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Terra, Vênus, Saturno, Urano, Júpiter, Marte, Netuno, Mercúrio.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }


   // ---------------- DIFICULDADE 2 FUNÇÕES PERGUNTAS ---------‐

  static int D2pergunta1 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Fabiano coseu seu paletó antes de sair.","Fabiano fechou o saco antes de sair.","Fabiano pegou seu paletó antes de sair.","Fabiano cortou o saco antes de cair.","Fabiano rasgou seu paletó antes de cair."};
  
  System.out.println("Qual a tradução da frase ''Fabiano cogió su saco antes de salir'' ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Fabiano pegou seu paletó antes de sair.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D2pergunta2 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Japão e Serra Leoa.","Austrália e Afeganistão.","Itália e Chade.","Brasil e Congo.","Estados Unidos e Angola."};
  
  System.out.println("Quais os países que tem a maior e a menor expectativa de vida do mundo ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Japão e Serra Leoa.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  
  static int D2pergunta3 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Thomson, Dalton, Rutherford, Rutherford-Bohr.","Rutherford-Bohr, Rutherford, Thomson, Dalton.","Dalton, Rutherford-Bohr, Thomson, Rutherford.","Dalton, Thomson, Rutherford-Bohr, Rutherford.","Dalton, Thomson, Rutherford, Rutherford-Bohr."};
  
  System.out.println("Em que ordem surgiram os modelos atômicos ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Dalton, Thomson, Rutherford, Rutherford-Bohr.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D2pergunta4 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Eu caibo.","Ele cabe.","Que eu caiba.","Eu cabo.","Nenhuma das alternativas."};
  
  System.out.println("Como é a conjunção do verbo na primeira pessoa do singular do presente do indicativo ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Eu caibo.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  
  static int D2pergunta5 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"45.","60.","90.","180.","360."};
  
  System.out.println("Quantos graus são necessários para que dois ângulos sejam complementares ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("90.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D2pergunta6 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Mais uma vez, portou-se mal.","É um homem mal.","Esse é o mal de todos.","Mal falou nele, o Fulano apareceu.","É um mau vendedor."};
  
  System.out.println("Em qual das orações abaixo a palavra foi empregada incorretamente ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("É um homem mal.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D2pergunta7 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Muito Barulho por Nada (2012).","Capitães da Areia (2011).","A Dama das Camélias (1936).","A Revolução dos Bichos (1954).","Excalibur (1981)."};
  
  System.out.println("Qual desses filmes foi baseado na obra de Shakespeare ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Muito Barulho por Nada (2012).")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D2pergunta8 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Legenda.","Conto.","História.","Lenda.","Legendário."};
  
  System.out.println("O que a palavra Legend significa em português ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Lenda.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D2pergunta9 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Cobre.","Prata.","Mercúrio.","Ouro.","Manganês."};
  
  System.out.println("Qual o metal cujo símbolo químico é o Au ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Ouro.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D2pergunta10 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Paul Cézanne.","Pablo Picasso.","Diego Rivera.","Tarsila do Amaral.","Salvador Dalí."};
  
  System.out.println("Quem pintou ''Guernica'' ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Pablo Picasso.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D2pergunta11 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Tubarão branco, crocodilo e sucuri.","Tigre, gavião e orca.","Hiena, urso branco e lobo cinzento.","Orca, onça e tarântula.","Leão, tubarão branco e urso cinzento."};
  
  System.out.println("Quais são os três predadores do reino animal reconhecidos pela habilidade de caçar em grupo, se camuflar para surpreender As presas e possuir sentidos apurados, respectivamente:  ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Hiena, urso branco e lobo cinzento.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D2pergunta12 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Índia.","Filipinas.","Moçambique.","Macau.","Portugal."};
  
  System.out.println("Em qual local da Ásia o português é língua oficial ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Macau.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D2pergunta13 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Tipo A.","Tipo B.","Tipo O.","Tipo AB.","Tipo ABO."};
  
  System.out.println("As pessoas de qual tipo sanguíneo são consideradas doadores universais ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Tipo O.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D2pergunta14 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"A Filosofia.","A Biologia.","A Matemática.","A Astronomia.","A Mitologia."};
  
  System.out.println("Qual foi o recurso utilizado inicialmente pelo homem para explicar a origem das coisas ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("A Mitologia.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D2pergunta15 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Caipora.","Saci.","Lobisomem.","Boitatá.","Negrinho do Pastoreio."};
  
  System.out.println("Qual personagem folclórico costuma ser agradado pelos Caçadores com a oferta de fumo ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Caipora.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D2pergunta16 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Platão.","Galileu Galilei.","Descartes.","Sócrates.","Francis Bacon."};
  
  System.out.println("De quem é a famosa frase ''penso logo existo'' ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Descartes.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  
  static int D2pergunta17 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Alexandrino Francisco Lisboa.","Manuel Francisco Lisboa.","Alex Francisco Lisboa.","Francisco Antônio Lisboa.","Antônio Francisco Lisboa."};
  
  System.out.println("Qual era o nome de Aleijadinho ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Antônio Francisco Lisboa.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D2pergunta18 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Ares e Hermes.","Cronos e Apolo.","Zeus e Hades.","Dionísio e deméter.","Zeus e Ares."};
  
  System.out.println("Júpiter e Plutão são os correlatos Romanos de quais deuses gregos ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Zeus e Hades.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D2pergunta19 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Baleia Azul.","Dinossauro.","Elefante Africano.","Tubarão Branco.","Girafa."};
  
  System.out.println("Qual o maior animal terrestre ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Elefante Africano.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D2pergunta20 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Gaspar, Nicolau e Natanael.","Belchior, Gaspar e Baltazar.","Belchior, Gaspar e Natanael.","Gabriel, Benjamim e Melchior.","Melchior, Noé e Galileu."};
  
  System.out.println(" Quais os nomes dos três reis magos ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Belchior, Gaspar e Baltazar.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D2pergunta21 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Judaísmo.","Zoroastrismo.","Islamismo.","Cristianismo.","Hinduísmo."};
  
  System.out.println("Qual a religião monoteísta que conta com o maior número de adeptos no mundo ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Cristianismo.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  // ---------------- DIFICULDADE 3 FUNÇÕES PERGUNTAS ---------‐
  
  
  static int D3pergunta1 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Vogais, semivogais e consoantes.","Artigo, verbo transitivo e verbo intransitivo.","Fonologia, Morfologia e Sintaxe.","Hiatos, ditongos e tritongos.","Substantivo, verbo e preposição."};
  
  System.out.println("Qual das alternativas abaixo apenas contém classes de palavras ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Substantivo, verbo e preposição.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  
  static int D3pergunta2 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Duas.","Centenas.","Infinitas.","Vinte.","Milhares."};
  
  System.out.println("Quantas casas decimais tem o número PI ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Infinitas.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D3pergunta3 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Dilma Rousseff.","Angela Merkel.","Margaret Thatcher.","Hillary Clinton.","Christine Lagarde."};
  
  System.out.println("Que líder Mundial ficou conhecido como ''Dama de Ferro'' ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Margaret Thatcher.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  
  static int D3pergunta4 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"300.000.000 metros por segundo (m/s).","150.000.000 metros por segundo (m/s).","199.792.458 metros por segundo (m/s).","299.792.458 metros por segundo (m/s).","30.000.000 metros por segundo (m/s)."};
  
  System.out.println("Qual a velocidade da luz ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("299.792.458 metros por segundo (m/s).")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D3pergunta5 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"12:06.","6:20.","2:20.","6:02.","12:20."};
  
  System.out.println("''It is six twenty ou twenty past six''. Que horas são em inglês ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("6:20.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  
  static int D3pergunta6 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"O oxigênio.","O nitrogênio.","O nitrato de sódio.","O dióxido de ferro.","O dióxido de carbono."};
  
  System.out.println("Que substância é absorvida pelas plantas e expirada por todos os seres vivos ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("O dióxido de carbono.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  
  static int D3pergunta7 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Uma cabra.","Uma vaca.","Uma ovelha.","Uma gata.","Uma loba."};
  
  System.out.println("Quem amamentou os gêmeos Rômulo e Remo ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Uma loba.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D3pergunta8 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Marie Curie.","Blaise Pascal.","Louis Pasteur.","Antoine Lavoisier.","Charles Darwin."};
  
  System.out.println("Qual o nome do cientista que descobriu o processo de pasteurização e a vacina contra a raiva ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Louis Pasteur.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D3pergunta9 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"A Juventude Socialista.","O escotismo.","O clube dos aventureiros.","A associação juvenil.","A Organização Mundial da Juventude."};
  
  System.out.println("Que organização juvenil foi fundado por Baden Powell ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("O escotismo.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D3pergunta10 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Rússia.","Filipinas.","Istambul.","Groenlândia.","Tanzânia."};
  
  System.out.println("Qual destes países é Transcontinental ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Rússia.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D3pergunta11 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Buenos Aires.","Rio de Janeiro.","Montevidéu.","Assunção.","Caraca."};
  
  System.out.println("Em que cidade ocorreu a Eco-92, a conferência das Nações Unidas sobre ambiente e desenvolvimento ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Rio de Janeiro.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  
  static int D3pergunta12 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"The Police.","The Doors.","Pink Floyd.","Nirvana.","AC/DC."};
  
  System.out.println("Jim Morrison era vocalista De que grupo ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("The Doors.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  
  static int D3pergunta13 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Alberto Caeiro, Ricardo Reis e Álvaro de Campos.","Ariano Suassuna, Raul Bopp e Quincas Borba.","Bento Teixeira Ricardo do Reis e Haroldo de Campos.","Alberto Caeiro, Ricardo Leite e Augusto de Campos.","Bento Teixeira, Ricardo Reis e Augusto de Campos."};
  
  System.out.println("Quais os principais heterônimos de Fernando Pessoa ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Alberto Caeiro, Ricardo Reis e Álvaro de Campos.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  
  static int D3pergunta14 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Estátua da Liberdade, Golden Gate Bridge e Empire State Building.","Estátua da Liberdade, Big Ben e The High line.","Argkor Wat, Taj Mahal e Skywalk no Grand Canyon.","Lincoln Memorial, Sydney Opera House e Burj Khalifa.","30 St Mary Axe, The High Line e Residencial 148 Spruce Street."};
  
  System.out.println("Quais destas construções famosas ficam nos Estados Unidos ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Estátua da Liberdade, Golden Gate Bridge e Empire State Building.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  
  static int D3pergunta15 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Nova Gales do Sul.","Victoria.","Tasmânia.","Queensland.","Norfolk."};
  
  System.out.println("Em que Estado Australiano fica situada a cidade Sidney ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Nova Gales do Sul.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D3pergunta16 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Pablo Picasso.","Salvador Dalí.","Marcel Duchamp.","Van Gogh.","Leonardo da Vinci."};
  
  System.out.println("Que artista é conhecido como um dos expoentes máximos do ''Ready-Mades'' ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Marcel Duchamp.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D3pergunta17 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Gregório de Matos, Bento Teixeira e Manuel Botelho de Oliveira.","Miguel de Cervantes, Gregório de Matos e Danthe Alighieri.","Padre António Vieira, Padre Manoel de Melo e Gregório de Matos.","Castro Alves, Bento Teixeira e Manuel Botelho de Oliveira.","Álvares de Azevedo, Gregório de Matos e Bento Teixeira."};
  
  System.out.println("Quais os principais autores do Barroco no Brasil ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Gregório de Matos, Bento Teixeira e Manuel Botelho de Oliveira.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D3pergunta18 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Igualdade das raças.","Justiças para os menos favorecidos.","Intolerância religiosa.","Prêmio Nobel da Paz.","Lutas contra o Apartheid"};
  
  System.out.println("Qual o tema do famoso discurso Eu Tenho um Sonho, de Martin Luther King?");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Igualdade das raças.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D3pergunta19 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Jesus Cristo.","Noé.","Matusalém.","Benjamim.","Abe."};
  
  System.out.println("Quem viveu, segundo a bíblia, 969 anos ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Matusalém.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D3pergunta20 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Homero.","Eurípedes.","Plutarco.","Ésquilo.","Sófocles."};
  
  System.out.println("Quem foi o criador da tragédia grega ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Ésquilo.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  static int D3pergunta21 (int cont){
    
    String verificador = "", resp;
  
String v[] = new String []{"Acordo ortográfico entre países cuja língua oficial é o francês e Acordo de cooperação financeira internacional entre as três maiores potências mundiais.", "Acordo entre países europeus acerca da imigração e Acordo econômico entre Inglaterra, Rússia a França.","Acordo entre vários países acerca das consequências do aquecimento global e Acordo de cooperação financeira internacional entre as três maiores potências mundiais.","Acordo de cooperação financeira internacional entre as três maiores potências mundiais e Acordo entre vários países acerca das consequências do aquecimento global.","Acordo entre vários países acerca das consequências do aquecimento global e Acordo entre Alemanha, império Austro-Húngaro e Itália acerca de apoio em caso de guerra."};
  
  System.out.println("O que são Acordo de Paris e Tríplice Aliança respectivamente ? ");
 
 for(int i = 0;i <=50;i++){
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  v = embaralhadordeString(v);
  }
  

   
  System.out.println("A) " + v[0]);
  System.out.println("B) " + v[1]);
  System.out.println("C) " + v[2]);
  System.out.println("D) " + v[3]);
  System.out.println("E) " + v[4]);
   resp = entrada.next();
 
  switch(resp){
    
    case "A":
    case "a":
    verificador = v[0];
    break;
    
    case "B":
    case "b":
    verificador = v[1];
    break;
    
    case "C":
    case "c":
    verificador = v[2];
    break;
    
    case "D":
    case "d":
    verificador = v[3];
    break;
    
    case "E":
    case "e":
    verificador = v[4];
    break;
    

  }
  
  if(verificador.equals("Acordo entre vários países acerca das consequências do aquecimento global e Acordo entre Alemanha, império Austro-Húngaro e Itália acerca de apoio em caso de guerra.")){
  
  System.out.println("Resposta Correta"+"\n");
   cont++; 
  }else{
    System.out.println("Resposta incorreta"+"\n");
  }
  
  return cont;
    
  }
  
  
   public static void main(String[] args) {
  
  int Dificuldade = 0, 
  selecionadordePergunta = 0, sala = 1, pergunta = 0, vitoria = 0, cont = 0, s = 0;
  
  int sorteio[] = new int []{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
 
  for(int i =0;i <=50;i++){
  sorteio = embaralhar(sorteio);
  }
  
  System.out.println("Bem vindo ao quiz ADO10 acerte 5 questões de 7 para passar pelas três salas do jogo e então ganha-lo. "+"\n");
  
  System.out.println(" Selecione a dificuldade do jogo: ");
  System.out.println("1 - Fácil ");
  System.out.println("2 - Médio ");
  System.out.println("3 - Difícil ");
  Dificuldade = entrada.nextInt();
  
  System.out.println("\n"+"SALA: "+sala+"\n");
  switch(Dificuldade){
  // DIFICULDADE 1
    case 1:
     
     do{
     
    selecionadordePergunta = sorteio[s];
    s++;
    
    switch(selecionadordePergunta){
    
      case 1:
      
     System.out.print((pergunta+1)+" - ");
     cont = D1pergunta1(cont);
     
      pergunta++;
      break;
      
      case 2:
      
      System.out.print((pergunta+1)+" - ");
     cont = D1pergunta2(cont);
      
      pergunta++;
      break;
      
      case 3:
      
      System.out.print((pergunta+1)+" - ");
     cont = D1pergunta3(cont);
      
      pergunta++;
      break;
      
      case 4:
      
      System.out.print((pergunta+1)+" - ");
     cont = D1pergunta4(cont);
      
      pergunta++;
      break;
      
      case 5:
      
      System.out.print((pergunta+1)+" - ");
     cont = D1pergunta5(cont);
      
      pergunta++;
      break;
      
      case 6:
      
      System.out.print((pergunta+1)+" - ");
     cont = D1pergunta6(cont);
      
      pergunta++;
      break;
      
      case 7:
      
      System.out.print((pergunta+1)+" - ");
     cont = D1pergunta7(cont);
      
      pergunta++;
      break;
      
      case 8:
      
      System.out.print((pergunta+1)+" - ");
     cont = D1pergunta8(cont);
      
      pergunta++;
      break;
      
      case 9:
      
      System.out.print((pergunta+1)+" - ");
     cont = D1pergunta9(cont);
      
      pergunta++;
      break;
      
      case 10:
      
      System.out.print((pergunta+1)+" - ");
     cont = D1pergunta10(cont);
      
      pergunta++;
      break;
      
      case 11:
      
      System.out.print((pergunta+1)+" - ");
     cont = D1pergunta11(cont);
      
      pergunta++;
      break;
      
      case 12:
      
      System.out.print((pergunta+1)+" - ");
     cont = D1pergunta12(cont);
      
      pergunta++;
      break;
      
      case 13:
      
      System.out.print((pergunta+1)+" - ");
     cont = D1pergunta13(cont);
      
      pergunta++;
      break;
      
      case 14:
      
      System.out.print((pergunta+1)+" - ");
     cont = D1pergunta14(cont);
      
      pergunta++;
      break;
      
      case 15:
      
      System.out.print((pergunta+1)+" - ");
     cont = D1pergunta15(cont);
      
      pergunta++;
      break;
      
      case 16:
      
      System.out.print((pergunta+1)+" - ");
     cont = D1pergunta16(cont);
      
      pergunta++;
      break;
      
      case 17:
      
      System.out.print((pergunta+1)+" - ");
     cont = D1pergunta17(cont);
      
      pergunta++;
      break;
      
      case 18:
      
      System.out.print((pergunta+1)+" - ");
     cont = D1pergunta18(cont);
      
      pergunta++;
      break;
      
      case 19:
      
      System.out.print((pergunta+1)+" - ");
     cont = D1pergunta19(cont);
      
      pergunta++;
      break;
      
      case 20:
      
      System.out.print((pergunta+1)+" - ");
     cont = D1pergunta20(cont);
      
      pergunta++;
      break;
      
      case 21:
      
      System.out.print((pergunta+1)+" - ");
     cont = D1pergunta21(cont);
      
      pergunta++;
      break;
 
    }
    
if(sala == 3 && cont >= 5 && pergunta == 7){
      System.out.println("\n"+"VOCÊ VENCEU O JOGO"+ "\n");
      
      System.out.println("PARABENS"+"\n");
      System.out.println("FIM DE JOGO");
      System.out.println("\n"+"FEITO POR:"+"\n"+"\n"+"ANTHONY RICHARD SANTOS DA COSTA"+"\n"+"          &"+"\n"+" INGRID BARBOSA DRUDI");
     vitoria = 1;
      break;
      }
    
    if(cont >= 5 && pergunta == 7){
      cont = 0; pergunta = 0;
        System.out.println("\n"+"Parabens você passou para a proxima sala "+"\n");
       sala++; 
     System.out.println("\n"+"SALA: "+ sala+"\n");
      }else if(cont < 5 && pergunta == 7){
        System.out.println("\n"+"Você não atingiu a pontuaçao necessária "+"\n");
        
        System.out.println("VOCÊ PERDEU"+ "\n");
        
     System.out.println("FIM DE JOGO");
     System.out.println("\n"+"FEITO POR:"+"\n"+"\n"+"ANTHONY RICHARD SANTOS DA COSTA"+"\n"+"          &"+"\n"+" INGRID BARBOSA DRUDI");
     vitoria = 1;
     break;
      }
    
  }while(vitoria != 1);
    
    break;
    
    // DIFICULDADE 2
    
    case 2:
    
      do{
     
    selecionadordePergunta = sorteio[s];
    s++;
    
    switch(selecionadordePergunta){
    
      case 1:
      
     System.out.print((pergunta+1)+" - ");
     cont = D2pergunta1(cont);
     
      pergunta++;
      break;
      
      case 2:
      
      System.out.print((pergunta+1)+" - ");
     cont = D2pergunta2(cont);
      
      pergunta++;
      break;
      
      case 3:
      
      System.out.print((pergunta+1)+" - ");
     cont = D2pergunta3(cont);
      
      pergunta++;
      break;
      
      case 4:
      
      System.out.print((pergunta+1)+" - ");
     cont = D2pergunta4(cont);
      
      pergunta++;
      break;
      
      case 5:
      
      System.out.print((pergunta+1)+" - ");
     cont = D2pergunta5(cont);
      
      pergunta++;
      break;
      
      case 6:
      
      System.out.print((pergunta+1)+" - ");
     cont = D2pergunta6(cont);
      
      pergunta++;
      break;
      
      case 7:
      
      System.out.print((pergunta+1)+" - ");
     cont = D2pergunta7(cont);
      
      pergunta++;
      break;
      
      case 8:
      
      System.out.print((pergunta+1)+" - ");
     cont = D2pergunta8(cont);
      
      pergunta++;
      break;
      
      case 9:
      
      System.out.print((pergunta+1)+" - ");
     cont = D2pergunta9(cont);
      
      pergunta++;
      break;
      
      case 10:
      
      System.out.print((pergunta+1)+" - ");
     cont = D2pergunta10(cont);
      
      pergunta++;
      break;
      
      case 11:
      
      System.out.print((pergunta+1)+" - ");
     cont = D2pergunta11(cont);
      
      pergunta++;
      break;
      
      case 12:
      
      System.out.print((pergunta+1)+" - ");
     cont = D2pergunta12(cont);
      
      pergunta++;
      break;
      
      case 13:
      
      System.out.print((pergunta+1)+" - ");
     cont = D2pergunta13(cont);
      
      pergunta++;
      break;
      
      case 14:
      
      System.out.print((pergunta+1)+" - ");
     cont = D2pergunta14(cont);
      
      pergunta++;
      break;
      
      case 15:
      
      System.out.print((pergunta+1)+" - ");
     cont = D2pergunta15(cont);
      
      pergunta++;
      break;
      
      case 16:
      
      System.out.print((pergunta+1)+" - ");
     cont = D2pergunta16(cont);
      
      pergunta++;
      break;
      
      case 17:
      
      System.out.print((pergunta+1)+" - ");
     cont = D2pergunta17(cont);
      
      pergunta++;
      break;
      
      case 18:
      
      System.out.print((pergunta+1)+" - ");
     cont = D2pergunta18(cont);
      
      pergunta++;
      break;
      
      case 19:
      
      System.out.print((pergunta+1)+" - ");
     cont = D2pergunta19(cont);
      
      pergunta++;
      break;
      
      case 20:
      
      System.out.print((pergunta+1)+" - ");
     cont = D2pergunta20(cont);
      
      pergunta++;
      break;
      
      case 21:
      
      System.out.print((pergunta+1)+" - ");
     cont = D2pergunta21(cont);
      
      pergunta++;
      break;
 
    }
    
if(sala == 3 && cont >= 5 && pergunta == 7){
      System.out.println("\n"+"VOCÊ VENCEU O JOGO"+ "\n");
      
      System.out.println("PARABENS"+"\n");
      System.out.println("FIM DE JOGO");
      System.out.println("\n"+"FEITO POR:"+"\n"+"\n"+"ANTHONY RICHARD SANTOS DA COSTA"+"\n"+"          &"+"\n"+" INGRID BARBOSA DRUDI");
     vitoria = 1;
      break;
      }
    
    if(cont >= 5 && pergunta == 7){
      cont = 0; pergunta = 0;
        System.out.println("\n"+"Parabens você passou para a proxima sala "+"\n");
       sala++; 
     System.out.println("\n"+"SALA: "+ sala+"\n");
      }else if(cont < 5 && pergunta == 7){
        System.out.println("\n"+"Você não atingiu a pontuaçao necessária "+"\n");
        
        System.out.println("VOCÊ PERDEU"+ "\n");
        
     System.out.println("FIM DE JOGO");
     System.out.println("\n"+"FEITO POR:"+"\n"+"\n"+"ANTHONY RICHARD SANTOS DA COSTA"+"\n"+"          &"+"\n"+" INGRID BARBOSA DRUDI");
     vitoria = 1;
     break;
      }
    
  }while(vitoria != 1);
    
    break;
    
    // DIFICULDADE 3
    
    case 3:
    
    do{
     
    selecionadordePergunta = sorteio[s];
    s++;
    
    switch(selecionadordePergunta){
    
      case 1:
      
     System.out.print((pergunta+1)+" - ");
     cont = D3pergunta1(cont);
     
      pergunta++;
      break;
      
      case 2:
      
      System.out.print((pergunta+1)+" - ");
     cont = D3pergunta2(cont);
      
      pergunta++;
      break;
      
      case 3:
      
      System.out.print((pergunta+1)+" - ");
     cont = D3pergunta3(cont);
      
      pergunta++;
      break;
      
      case 4:
      
      System.out.print((pergunta+1)+" - ");
     cont = D3pergunta4(cont);
      
      pergunta++;
      break;
      
      case 5:
      
      System.out.print((pergunta+1)+" - ");
     cont = D3pergunta5(cont);
      
      pergunta++;
      break;
      
      case 6:
      
      System.out.print((pergunta+1)+" - ");
     cont = D3pergunta6(cont);
      
      pergunta++;
      break;
      
      case 7:
      
      System.out.print((pergunta+1)+" - ");
     cont = D3pergunta7(cont);
      
      pergunta++;
      break;
      
      case 8:
      
      System.out.print((pergunta+1)+" - ");
     cont = D3pergunta8(cont);
      
      pergunta++;
      break;
      
      case 9:
      
      System.out.print((pergunta+1)+" - ");
     cont = D3pergunta9(cont);
      
      pergunta++;
      break;
      
      case 10:
      
      System.out.print((pergunta+1)+" - ");
     cont = D3pergunta10(cont);
      
      pergunta++;
      break;
      
      case 11:
      
      System.out.print((pergunta+1)+" - ");
     cont = D3pergunta11(cont);
      
      pergunta++;
      break;
      
      case 12:
      
      System.out.print((pergunta+1)+" - ");
     cont = D3pergunta12(cont);
      
      pergunta++;
      break;
      
      case 13:
      
      System.out.print((pergunta+1)+" - ");
     cont = D3pergunta13(cont);
      
      pergunta++;
      break;
      
      case 14:
      
      System.out.print((pergunta+1)+" - ");
     cont = D3pergunta14(cont);
      
      pergunta++;
      break;
      
      case 15:
      
      System.out.print((pergunta+1)+" - ");
     cont = D3pergunta15(cont);
      
      pergunta++;
      break;
      
      case 16:
      
      System.out.print((pergunta+1)+" - ");
     cont = D3pergunta16(cont);
      
      pergunta++;
      break;
      
      case 17:
      
      System.out.print((pergunta+1)+" - ");
     cont = D3pergunta17(cont);
      
      pergunta++;
      break;
      
      case 18:
      
      System.out.print((pergunta+1)+" - ");
     cont = D3pergunta18(cont);
      
      pergunta++;
      break;
      
      case 19:
      
      System.out.print((pergunta+1)+" - ");
     cont = D3pergunta19(cont);
      
      pergunta++;
      break;
      
      case 20:
      
      System.out.print((pergunta+1)+" - ");
     cont = D3pergunta20(cont);
      
      pergunta++;
      break;
      
      case 21:
      
      System.out.print((pergunta+1)+" - ");
     cont = D3pergunta21(cont);
      
      pergunta++;
      break;
 
    }
    
if(sala == 3 && cont >= 5 && pergunta == 7){
      System.out.println("\n"+"VOCÊ VENCEU O JOGO"+ "\n");
      
      System.out.println("PARABENS"+"\n");
      System.out.println("FIM DE JOGO");
      System.out.println("\n"+"FEITO POR:"+"\n"+"\n"+"ANTHONY RICHARD SANTOS DA COSTA"+"\n"+"          &"+"\n"+" INGRID BARBOSA DRUDI");
     vitoria = 1;
      break;
      }
    
    if(cont >= 5 && pergunta == 7){
      cont = 0; pergunta = 0;
        System.out.println("\n"+"Parabens você passou para a proxima sala "+"\n");
       sala++; 
     System.out.println("\n"+"SALA: "+ sala+"\n");
      }else if(cont < 5 && pergunta == 7){
        System.out.println("\n"+"Você não atingiu a pontuaçao necessária "+"\n");
        
        System.out.println("VOCÊ PERDEU"+ "\n");
        
     System.out.println("FIM DE JOGO");
     System.out.println("\n"+"FEITO POR:"+"\n"+"\n"+"ANTHONY RICHARD SANTOS DA COSTA"+"\n"+"          &"+"\n"+" INGRID BARBOSA DRUDI");
     vitoria = 1;
     break;
      }
    
  }while(vitoria != 1);
    
    break;
  }
    
  }
}
