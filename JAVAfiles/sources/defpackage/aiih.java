package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.lang.reflect.Field;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import org.xbill.DNS2.ResolverConfig;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiih implements aiid {
    private static final alog a;
    private final List b;
    private final aiia c;
    private final aiib d;

    static {
        int i = alog.d;
        a = alsx.a;
    }

    public aiih(List list, aiia aiiaVar, aiib aiibVar) {
        list.getClass();
        this.b = (List) Collection.EL.stream(list).map(new aiec(12)).collect(Collectors.toList());
        aiiaVar.getClass();
        this.c = aiiaVar;
        aiibVar.getClass();
        this.d = aiibVar;
    }

    static final String[] e() {
        ResolverConfig b = ResolverConfig.b();
        if (b == null) {
            return new String[0];
        }
        return b.servers;
    }

    private final ListenableFuture f(String str, Class cls) {
        ListenableFuture bH;
        List list = this.b;
        int a2 = aiie.a(cls);
        if (list.isEmpty()) {
            return albo.bI(a);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                atal atalVar = new atal(new atlr(str, a2));
                aihy b = aiie.b(str, cls, e());
                this.c.a(b);
                List list2 = null;
                try {
                    try {
                        list2 = atalVar.i(cls);
                        bH = albo.bI(list2);
                    } catch (ClassCastException e) {
                        advr.i(e, "classcastexception - this should never happen", new Object[0]);
                        bH = albo.bH(e);
                    }
                    return bH;
                } finally {
                    this.d.a(aiie.d(atalVar, b, list2));
                }
            } catch (atns e2) {
                advr.s(e2, "Invalid %s lookup target: %s", atnu.a(a2), str);
                return albo.bI(a);
            }
        }
        advr.q("Unable to lookup records for null target!", new Object[0]);
        return albo.bI(a);
    }

    @Override // defpackage.aiid
    public final synchronized ListenableFuture a(String str) {
        int i;
        ListenableFuture bH;
        if (this.b.isEmpty()) {
            return albo.bI(a);
        }
        aihy b = aiie.b(str, atka.class, e());
        this.c.a(b);
        try {
            bH = albo.bI(Arrays.asList(atow.k(str)));
            i = 0;
        } catch (UnknownHostException e) {
            i = 3;
            try {
                bH = albo.bH(e);
            } catch (Throwable th) {
                th = th;
                this.d.a(aiie.d(new atal(i, (char[]) null), b, null));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i = 1;
            this.d.a(aiie.d(new atal(i, (char[]) null), b, null));
            throw th;
        }
        this.d.a(aiie.d(new atal(i, (char[]) null), b, null));
        return bH;
    }

    @Override // defpackage.aiid
    public final synchronized ListenableFuture b(String str) {
        return f(str, atmb.class);
    }

    @Override // defpackage.aiid
    public final synchronized ListenableFuture c(String str) {
        return f(str, atng.class);
    }

    public final void d() {
        try {
            List list = this.b;
            Field declaredField = ResolverConfig.b().getClass().getDeclaredField("servers");
            declaredField.setAccessible(true);
            if (!list.isEmpty()) {
                declaredField.set(ResolverConfig.b(), list.toArray(new String[0]));
            }
            atlr.c();
            atlr.f().e();
            advr.k("Using name servers: %s", Arrays.toString(ResolverConfig.b().servers));
        } catch (IllegalAccessException | LinkageError | NoSuchFieldException e) {
            advr.e(e, "Exception setting name servers", new Object[0]);
        }
    }
}
