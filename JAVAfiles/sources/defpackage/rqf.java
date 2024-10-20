package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class rqf extends arpw implements arqv {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    int g;
    final /* synthetic */ rqg h;
    final /* synthetic */ File i;
    final /* synthetic */ rpq j;
    final /* synthetic */ lrf k;
    final /* synthetic */ ahjj l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqf(rqg rqgVar, File file, ahjj ahjjVar, rpq rpqVar, lrf lrfVar, arpe arpeVar) {
        super(2, arpeVar);
        this.h = rqgVar;
        this.i = file;
        this.l = ahjjVar;
        this.j = rpqVar;
        this.k = lrfVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((rqf) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        arpl arplVar = arpl.a;
        if (this.g != 0) {
            obj6 = this.f;
            obj5 = this.e;
            obj4 = this.d;
            obj3 = this.c;
            obj2 = this.b;
            Object obj8 = this.a;
            aqil.P(obj);
            obj7 = obj8;
        } else {
            aqil.P(obj);
            obj2 = this.h;
            obj3 = this.i;
            obj4 = this.l;
            obj5 = this.j;
            lrf lrfVar = this.k;
            asgm asgmVar = rqg.f;
            this.a = asgmVar;
            this.b = obj2;
            this.c = obj3;
            this.d = obj4;
            this.e = obj5;
            this.f = lrfVar;
            this.g = 1;
            if (asgmVar.b(this) != arplVar) {
                obj6 = lrfVar;
                obj7 = asgmVar;
            } else {
                return arplVar;
            }
        }
        try {
            long c = rjt.c("DatabaseRestorerImpl::runWithSpecifiedBackupDatabase", new rqe((rqg) obj2, (File) obj3, (ahjj) obj4, (rpq) obj5, (lrf) obj6, 0));
            alvw g = rqg.a.g();
            g.X(alwp.a, "BugleBackup");
            ((alvg) g.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/impl/DatabaseRestorerImpl$restoreFromBackupDatabase$2", "invokeSuspend", 114, "DatabaseRestorerImpl.kt")).s("Finished restoreFromBackupDatabase, elapsed time [%s]ms", arut.g(c));
            return new arut(c);
        } finally {
            ((asgm) obj7).d();
        }
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new rqf(this.h, this.i, this.l, this.j, this.k, arpeVar);
    }
}
