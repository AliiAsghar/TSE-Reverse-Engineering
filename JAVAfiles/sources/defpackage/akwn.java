package defpackage;

import android.os.Handler;
import android.os.Looper;
import j$.util.Collection;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class akwn {
    public static final Optional a = Optional.empty();
    public final AtomicReference b;
    public final AtomicBoolean c;
    public final akwo d;
    public final akws e;

    /* JADX INFO: Access modifiers changed from: protected */
    public akwn(akwo akwoVar, akws akwsVar) {
        new Handler(Looper.getMainLooper());
        this.b = new AtomicReference(a);
        this.c = new AtomicBoolean(false);
        this.d = akwoVar;
        this.e = akwsVar;
        akwk akwkVar = (akwk) akwsVar;
        akwkVar.c = new aktp();
        if (akwkVar.c == null) {
            return;
        }
        int i = 14;
        Collection.EL.stream(((aegl) akwsVar).a).map(new ajqy(i)).filter(new adru(i)).forEach(new ajql(5));
    }
}
