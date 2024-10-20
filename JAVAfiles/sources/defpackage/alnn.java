package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alnn extends allm {
    private static final long serialVersionUID = 0;
    transient int c;

    public alnn() {
        super(new almd(12));
        this.c = 2;
        d.s(true);
        this.c = 2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = 2;
        int readInt = objectInputStream.readInt();
        p(new almd(12));
        alzz.S(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        alzz.T(this, objectOutputStream);
    }

    @Override // defpackage.allm, defpackage.alla
    public final /* bridge */ /* synthetic */ Collection a() {
        return new almf(this.c);
    }
}
