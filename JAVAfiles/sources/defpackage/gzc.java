package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzc implements Callable {
    final /* synthetic */ gih a;
    final /* synthetic */ gzn b;

    public gzc(gzn gznVar, gih gihVar) {
        this.b = gznVar;
        this.a = gihVar;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List call() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.b.a.l();
        try {
            Cursor bC = gvf.bC(this.b.a, this.a, true);
            try {
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                while (bC.moveToNext()) {
                    String string = bC.getString(0);
                    if (!hashMap.containsKey(string)) {
                        hashMap.put(string, new ArrayList());
                    }
                    String string2 = bC.getString(0);
                    if (!hashMap2.containsKey(string2)) {
                        hashMap2.put(string2, new ArrayList());
                    }
                }
                bC.moveToPosition(-1);
                this.b.o(hashMap);
                this.b.n(hashMap2);
                ArrayList arrayList = new ArrayList(bC.getCount());
                while (bC.moveToNext()) {
                    String string3 = bC.getString(0);
                    gtk C = gvf.C(bC.getInt(1));
                    gsi c = gsi.c(bC.getBlob(2));
                    int i = bC.getInt(3);
                    int i2 = bC.getInt(4);
                    long j = bC.getLong(14);
                    long j2 = bC.getLong(15);
                    long j3 = bC.getLong(16);
                    gry A = gvf.A(bC.getInt(17));
                    long j4 = bC.getLong(18);
                    long j5 = bC.getLong(19);
                    int i3 = bC.getInt(20);
                    long j6 = bC.getLong(21);
                    int i4 = bC.getInt(22);
                    int I = gvf.I(bC.getInt(5));
                    gzu D = gvf.D(bC.getBlob(6));
                    if (bC.getInt(7) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bC.getInt(8) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (bC.getInt(9) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bC.getInt(10) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    arrayList.add(new gyr(string3, C, c, j, j2, j3, new gsf(D, I, z, z2, z3, z4, bC.getLong(11), bC.getLong(12), gvf.E(bC.getBlob(13))), i, A, j4, j5, i3, i2, j6, i4, (ArrayList) hashMap.get(bC.getString(0)), (ArrayList) hashMap2.get(bC.getString(0))));
                }
                this.b.a.o();
                return arrayList;
            } finally {
                bC.close();
            }
        } finally {
            this.b.a.m();
        }
    }

    protected final void finalize() {
        this.a.j();
    }
}
