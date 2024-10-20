package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alln extends alkh {
    private static final long serialVersionUID = 0;
    transient int c;

    public alln() {
        super(new almd(12));
        albo.x(3, "expectedValuesPerKey");
        this.c = 3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = 3;
        int readInt = objectInputStream.readInt();
        p(new almd());
        alzz.S(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        alzz.T(this, objectOutputStream);
    }

    @Override // defpackage.alkh, defpackage.alla
    public final /* bridge */ /* synthetic */ Collection a() {
        return new ArrayList(this.c);
    }
}
