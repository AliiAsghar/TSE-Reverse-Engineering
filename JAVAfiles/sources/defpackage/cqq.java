package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqq {
    public final List a;
    public final cql b;
    public final int c;
    public int d;

    public cqq(List list) {
        this(list, null);
    }

    public final MotionEvent a() {
        cql cqlVar = this.b;
        if (cqlVar != null) {
            return cqlVar.b.b;
        }
        return null;
    }

    public cqq(List list, cql cqlVar) {
        this.a = list;
        this.b = cqlVar;
        MotionEvent a = a();
        int i = 0;
        this.c = a != null ? a.getButtonState() : 0;
        MotionEvent a2 = a();
        if (a2 != null) {
            a2.getMetaState();
        }
        MotionEvent a3 = a();
        if (a3 != null) {
            int actionMasked = a3.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i = 6;
                                break;
                            case 9:
                                i = 4;
                                break;
                            case 10:
                                i = 5;
                                break;
                        }
                    }
                    i = 3;
                }
                i = 2;
            }
            i = 1;
        } else {
            int size = list.size();
            while (i < size) {
                crc crcVar = (crc) list.get(i);
                if (cqr.g(crcVar)) {
                    i = 2;
                } else if (cqr.e(crcVar)) {
                    i = 1;
                } else {
                    i++;
                }
            }
            i = 3;
        }
        this.d = i;
    }
}
