package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fsu implements frc {
    private final fso a;
    private final long[] b;
    private final Map c;
    private final Map d;
    private final Map e;

    public fsu(fso fsoVar, Map map, Map map2, Map map3) {
        this.a = fsoVar;
        this.d = map2;
        this.e = map3;
        this.c = DesugarCollections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        fsoVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.b = jArr;
    }

    @Override // defpackage.frc
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.frc
    public final int b(long j) {
        long[] jArr = this.b;
        int ah = eul.ah(jArr, j, false);
        if (ah < jArr.length) {
            return ah;
        }
        return -1;
    }

    @Override // defpackage.frc
    public final long c(int i) {
        return this.b[i];
    }

    @Override // defpackage.frc
    public final List e(long j) {
        ArrayList arrayList = new ArrayList();
        fso fsoVar = this.a;
        fsoVar.e(j, fsoVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        fsoVar.g(j, false, fsoVar.h, treeMap);
        Map map = this.c;
        Map map2 = this.d;
        fsoVar.f(j, map, map2, fsoVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Map map3 = this.e;
            Pair pair = (Pair) arrayList.get(i);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                fss fssVar = (fss) map2.get(pair.first);
                dzg.g(fssVar);
                esy esyVar = new esy();
                esyVar.b = decodeByteArray;
                esyVar.f = fssVar.b;
                esyVar.g = 0;
                esyVar.c(fssVar.c, 0);
                esyVar.e = fssVar.e;
                esyVar.h = fssVar.f;
                esyVar.i = fssVar.g;
                esyVar.j = fssVar.j;
                arrayList2.add(esyVar.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            fss fssVar2 = (fss) map2.get(entry.getKey());
            dzg.g(fssVar2);
            esy esyVar2 = (esy) entry.getValue();
            CharSequence charSequence = esyVar2.a;
            dzg.g(charSequence);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (fsm fsmVar : (fsm[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), fsm.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(fsmVar), spannableStringBuilder.getSpanEnd(fsmVar), (CharSequence) "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            esyVar2.c(fssVar2.c, fssVar2.d);
            esyVar2.e = fssVar2.e;
            esyVar2.f = fssVar2.b;
            esyVar2.h = fssVar2.f;
            esyVar2.d(fssVar2.i, fssVar2.h);
            esyVar2.j = fssVar2.j;
            arrayList2.add(esyVar2.a());
        }
        return arrayList2;
    }
}
