package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alse extends alkh {
    private static final long serialVersionUID = 0;
    transient alhr c;

    public alse(Map map, alhr alhrVar) {
        super(map);
        this.c = alhrVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Object readObject = objectInputStream.readObject();
        readObject.getClass();
        this.c = (alhr) readObject;
        Object readObject2 = objectInputStream.readObject();
        readObject2.getClass();
        p((Map) readObject2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.c);
        objectOutputStream.writeObject(((alla) this).a);
    }

    @Override // defpackage.alkh, defpackage.alla
    public final /* bridge */ /* synthetic */ Collection a() {
        return (List) this.c.get();
    }

    @Override // defpackage.alla, defpackage.alli
    public final Map m() {
        Map map = ((alla) this).a;
        if (map instanceof NavigableMap) {
            return new alkq(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new alkt(this, (SortedMap) map);
        }
        return new alkm(this, map);
    }

    @Override // defpackage.alla, defpackage.alli
    public final Set n() {
        Map map = ((alla) this).a;
        if (map instanceof NavigableMap) {
            return new alkr(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new alku(this, (SortedMap) map);
        }
        return new alkp(this, map);
    }
}
