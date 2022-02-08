class Solution {
public:
    bool isValid(string s) {
    int i=-1;
    for(char ch:s) {
        if(ch == '(' || ch == '{' || ch == '[')
            s[++i] = ch;
        else if(i>-1 && ((ch=='}'&&s[i]=='{') || (ch==')'&&s[i]=='(') || (ch==']'&&s[i]=='[')))
            i--;
        else
            return false;
    }
    return i==-1;
}

};