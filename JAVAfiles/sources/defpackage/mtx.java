package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import j$.time.Instant;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mtx extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mtx(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [yga, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        Optional optional;
        switch (this.b) {
            case 0:
                return lga.ay(((mty) this.a).b.k());
            case 1:
                return MessageData.al(((mty) this.a).b.k());
            case 2:
                return Instant.ofEpochMilli(((mty) this.a).b.t());
            case 3:
                return Instant.ofEpochMilli(((mty) this.a).b.v());
            case 4:
                this.a.a();
                return arnb.a;
            case 5:
                return Integer.valueOf(lga.U(znj.I(Optional.of(((ngg) this.a).a))));
            case 6:
                return Integer.valueOf(lga.U(znj.H(Optional.of(((ngg) this.a).a))));
            case 7:
                return Integer.valueOf(ydf.c(((ngg) this.a).a));
            case 8:
                return Integer.valueOf(lga.U(znj.J(Optional.of(((ngg) this.a).a))));
            case 9:
                ?? r0 = ((pui) this.a).d.get();
                r0.getClass();
                ArrayList arrayList = new ArrayList();
                for (msh mshVar : r0) {
                    if (mshVar != null) {
                        optional = mshVar.e();
                    } else {
                        optional = null;
                    }
                    if (optional != null) {
                        arrayList.add(optional);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((Optional) obj).isPresent()) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(aqjn.J(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add((qei) ((Optional) it.next()).get());
                }
                return arrayList3;
            case 10:
                return new Object[((asai[]) this.a).length];
            case 11:
                return new Object[((asai[]) this.a).length];
            case 12:
                return new Object[((asai[]) this.a).length];
            case 13:
                return new Object[((asai[]) this.a).length];
            case 14:
                return new Object[((asai[]) this.a).length];
            case 15:
                return new Object[((asai[]) this.a).length];
            case 16:
                return new Object[((asai[]) this.a).length];
            case 17:
                return new Object[((asai[]) this.a).length];
            case 18:
                return new Object[((asai[]) this.a).length];
            case 19:
                return new Object[((asai[]) this.a).length];
            default:
                return new Object[((asai[]) this.a).length];
        }
    }
}
