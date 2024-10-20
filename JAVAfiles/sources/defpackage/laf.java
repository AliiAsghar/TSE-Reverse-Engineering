package defpackage;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class laf extends arpw implements arqv {
    final /* synthetic */ long a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public laf(idb idbVar, long j, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = idbVar;
        this.a = j;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                return ((laf) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }
            return ((laf) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((laf) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [armf, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        long j;
        int i = this.c;
        if (i != 0) {
            int i2 = 1;
            if (i != 1) {
                aqil.P(obj);
                ((wzp) ((reb) this.b).w.b()).i(this.a);
                return arnb.a;
            }
            aqil.P(obj);
            idb idbVar = (idb) this.b;
            iql iqlVar = idbVar.j;
            int longValue = (int) ((Number) idbVar.c.b()).longValue();
            long j2 = this.a;
            if (j2 >= 0 && longValue >= 0) {
                tbs d = PartsTable.d();
                d.g(new ilg(j2, i2));
                d.h(new atkn((Object) PartsTable.d.a, false));
                d.u(longValue);
                alog t = d.b().t();
                t.getClass();
                ArrayList arrayList = new ArrayList();
                alur it = t.iterator();
                it.getClass();
                while (it.hasNext()) {
                    PartsTable.BindData bindData = (PartsTable.BindData) it.next();
                    try {
                        bindData.getClass();
                        Uri n = bindData.n();
                        if (bindData.A() != null && !((phv) iqlVar.d.b()).a()) {
                            j = bindData.m();
                        } else if (n != null) {
                            String z = bindData.z();
                            z.getClass();
                            ParcelFileDescriptor d2 = iqlVar.d(n, z, iqlVar.e(n));
                            try {
                                if (((pib) iqlVar.f.b()).a() && d2.getStatSize() == 0) {
                                    alwl alwlVar = (alwl) ((aluw) iqlVar.c).i();
                                    alwlVar.X(ydl.s, z);
                                    alwlVar.X(ydl.R, n);
                                    alwlVar.q("Could not get file size, file is empty");
                                    throw new idl("Could not get file size, file is empty");
                                    break;
                                }
                                long statSize = d2.getStatSize();
                                armd.i(d2, null);
                                j = statSize;
                            } finally {
                                try {
                                    break;
                                } catch (Throwable th) {
                                }
                            }
                        } else {
                            alwl alwlVar2 = (alwl) ((aluw) iqlVar.c).i();
                            alwlVar2.X(ydl.s, bindData.z());
                            alwlVar2.q("Could not get file size, Uri is null");
                            throw new idl("Could not get file size, Uri is null");
                        }
                        String z2 = bindData.z();
                        z2.getClass();
                        long parseLong = Long.parseLong(z2);
                        MessageIdType p = bindData.p();
                        p.getClass();
                        arrayList.add(new icg(parseLong, p, j, bindData.x()));
                    } catch (idl e) {
                        alwl alwlVar3 = (alwl) ((aluw) iqlVar.c).i();
                        alwlVar3.X(ydl.s, bindData.z());
                        alwlVar3.X(ydl.R, bindData.n());
                        ((alwl) alwlVar3.g(e)).q("Unable to get metadata for attachment, skipping attachment for back up");
                    }
                }
                return arrayList;
            }
            return arnv.a;
        }
        aqil.P(obj);
        ((mbl) ((lag) this.b).c.b()).g("Bugle.HomeScreen.Blank.Duration", this.a);
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                return new laf((reb) this.b, this.a, arpeVar, 2);
            }
            return new laf((idb) this.b, this.a, arpeVar, 1);
        }
        return new laf((lag) this.b, this.a, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public laf(lag lagVar, long j, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = lagVar;
        this.a = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public laf(reb rebVar, long j, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = rebVar;
        this.a = j;
    }
}
