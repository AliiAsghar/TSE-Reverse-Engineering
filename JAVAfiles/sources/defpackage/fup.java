package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fup {
    public final int a;
    public final String b;
    public final int c;
    public final List d;
    public final byte[] e;

    public fup(int i, String str, int i2, List list, byte[] bArr) {
        List unmodifiableList;
        this.a = i;
        this.b = str;
        this.c = i2;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        this.d = unmodifiableList;
        this.e = bArr;
    }

    public final int a() {
        int i = this.c;
        if (i != 2) {
            if (i != 3) {
                return 0;
            }
            return 512;
        }
        return 2048;
    }
}
