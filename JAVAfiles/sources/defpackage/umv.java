package defpackage;

import android.content.Context;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class umv extends unp {
    public static final alwo a = alwo.o("BugleNotifications");
    public final armf b;
    public final Optional c;
    private final aneo d;

    public umv(aneo aneoVar, armf armfVar, Optional optional) {
        this.d = aneoVar;
        this.b = armfVar;
        this.c = optional;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.d = Duration.ofSeconds(1L);
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("UpdateUnreadCounterHandler");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        final umw umwVar = (umw) apbtVar;
        return aktp.ai(new Callable() { // from class: umu
            /* JADX WARN: Code restructure failed: missing block: B:423:0x0057, code lost:
            
                if (r9 != false) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
            
                if (r15.c != false) goto L10;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 2316
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.umu.call():java.lang.Object");
            }
        }, this.d);
    }

    @Override // defpackage.unx
    public final apca e() {
        return umw.a.getParserForType();
    }

    @Override // defpackage.unp, defpackage.unx
    public final /* synthetic */ boolean h(apbt apbtVar) {
        return j();
    }

    public final boolean j() {
        this.c.isPresent();
        if (aska.b((Context) ((wfh) this.c.get()).a) && ((wfh) this.c.get()).G()) {
            return true;
        }
        return false;
    }
}
