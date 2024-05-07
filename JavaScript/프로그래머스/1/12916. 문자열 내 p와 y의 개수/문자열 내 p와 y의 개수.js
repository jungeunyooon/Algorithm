function solution(s) {
    let p = 0;
    let y = 0;
    for (let spell of s) {
        spell = spell.toLowerCase();
        if (spell === 'p') p += 1;
        if (spell === 'y') y += 1;
    }
    return (p === y) ? true : false;
}
