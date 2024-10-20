package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.HttpCookie;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adjn implements Serializable {
    private static final long serialVersionUID = 3339215700684575599L;
    public String a;
    public String b;
    private long c;
    private long d;

    public adjn(HttpCookie httpCookie) {
        if (httpCookie != null) {
            this.d = httpCookie.getMaxAge();
            this.c = agkx.W().longValue();
            this.a = httpCookie.getName();
            this.b = httpCookie.getValue();
            return;
        }
        throw new NullPointerException("cookie parameter must not be null");
    }

    public static String a(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            adjn adjnVar = (adjn) it.next();
            long j = adjnVar.d;
            if (j != 0 && (j == -1 || TimeUnit.MILLISECONDS.toSeconds(agkx.W().longValue() - adjnVar.c) <= adjnVar.d)) {
                if (sb.length() > 0) {
                    sb.append("; ");
                }
                sb.append(String.format("%1$s=%2$s", adjnVar.a, adjnVar.b));
            }
        }
        return sb.toString();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.a = (String) objectInputStream.readObject();
        this.b = (String) objectInputStream.readObject();
        this.d = objectInputStream.readLong();
        this.c = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.a);
        objectOutputStream.writeObject(this.b);
        objectOutputStream.writeLong(this.d);
        objectOutputStream.writeLong(this.c);
    }
}
