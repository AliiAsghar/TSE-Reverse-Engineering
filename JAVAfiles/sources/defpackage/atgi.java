package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atgi extends athp {
    private static final long serialVersionUID = -4481126543819298617L;
    public atgj a;
    public atfw b;

    public atgi(atgj atgjVar, atfw atfwVar) {
        this.a = atgjVar;
        this.b = atfwVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.a = (atgj) objectInputStream.readObject();
        this.b = ((atfy) objectInputStream.readObject()).a(this.a.b);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.a);
        objectOutputStream.writeObject(this.b.p());
    }

    @Override // defpackage.athp
    protected final long a() {
        return this.a.a;
    }

    @Override // defpackage.athp
    protected final atfu b() {
        return this.a.b;
    }

    @Override // defpackage.athp
    public final atfw c() {
        return this.b;
    }
}
