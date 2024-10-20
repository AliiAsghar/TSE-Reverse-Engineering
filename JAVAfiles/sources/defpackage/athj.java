package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class athj implements Serializable {
    private static final long serialVersionUID = -6212696554273812441L;
    private transient atgc a;

    public athj(atgc atgcVar) {
        this.a = atgcVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.a = (atgc) objectInputStream.readObject();
    }

    private Object readResolve() {
        return athk.O(this.a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.a);
    }
}
