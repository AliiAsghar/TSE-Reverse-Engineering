package defpackage;

import j$.util.DesugarCollections;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alzo extends alzn {
    public static final Map c;
    private final alwr d;

    static {
        EnumMap enumMap = new EnumMap(alwr.class);
        for (alwr alwrVar : alwr.values()) {
            alzo[] alzoVarArr = new alzo[10];
            for (int i = 0; i < 10; i++) {
                alzoVarArr[i] = new alzo(i, alwrVar, alws.a);
            }
            enumMap.put((EnumMap) alwrVar, (alwr) alzoVarArr);
        }
        c = DesugarCollections.unmodifiableMap(enumMap);
    }

    public alzo(int i, alwr alwrVar, alws alwsVar) {
        super(alwsVar, i);
        alwrVar.getClass();
        this.d = alwrVar;
        if (alwsVar.c()) {
            return;
        }
        int i2 = alwrVar.l;
        i2 = alwsVar.d() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        alwsVar.f(sb);
        sb.append((char) i2);
    }

    @Override // defpackage.alzn
    public final void a(alzr alzrVar, Object obj) {
        alzrVar.d(obj, this.d, this.b);
    }
}
