package defpackage;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alos implements Serializable {
    private static final long serialVersionUID = 0;
    final alor a;

    public alos(alor alorVar) {
        this.a = alorVar;
    }

    Object readResolve() {
        return this.a.entrySet();
    }
}
