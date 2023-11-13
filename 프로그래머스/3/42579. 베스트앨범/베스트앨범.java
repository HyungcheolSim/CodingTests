import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer= new ArrayList();
        //장르 별 재생횟수 저장
        Map<String,Integer> num=new HashMap();
        Map<String,HashMap<Integer,Integer>> music=new HashMap();
        //노래의 고유번호, 재생횟수 저장
        for(int i=0;i<genres.length;i++){
            if(!num.containsKey(genres[i])){ //처음 추가되는 장르인 경우
                HashMap<Integer,Integer> map=new HashMap();
                map.put(i,plays[i]); //추가될 음악의 idx,재생횟수
                music.put(genres[i],map);// 장르명,추가될 음악의 idx,재생횟수를 가진 map 을 음악객체로
                num.put(genres[i],plays[i]);    //장르명,재생횟수
            }else{//장르가 이미 추가되었을 떄 ==>
                music.get(genres[i]).put(i,plays[i]); //이미 그 장르로 추가된 음악이 있음 그 장르에 해당하는 음악 추가
                
                num.put(genres[i],num.get(genres[i])+plays[i]);//추가할 음악의 장르 총 재생횟수에 더해주기
            }
        }
        List<String> keySet=new ArrayList(num.keySet());
        //keySet으로 저장한 장르 명들을 재생횟수에 따라 정렬
        Collections.sort(keySet,(s1,s2)->num.get(s2)-num.get(s1));
        
        for(String key:keySet){
            HashMap<Integer,Integer>musicInGenre=music.get(key);
            //해당 장르의 음악들의 index만 가져온 목록
            List<Integer> genre_key=new ArrayList(musicInGenre.keySet());
            
            Collections.sort(genre_key,(s1,s2)->musicInGenre.get(s2)-musicInGenre.get(s1));
            answer.add(genre_key.get(0));
            if(genre_key.size()>1){
                answer.add(genre_key.get(1));
            }
        }
            
        return answer.stream().mapToInt(x->x).toArray();
    }
}
