package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spanned;
import j$.util.Optional;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ezr implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ ezr(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        int i = 4;
        switch (this.a) {
            case 0:
                return new fbt((eti) obj);
            case 1:
                eqs eqsVar = (eqs) obj;
                int i2 = eqn.M;
                return eqsVar.a + ": " + eqsVar.b;
            case 2:
                flu fluVar = (flu) obj;
                fluVar.h();
                return fluVar.getClass().getSimpleName();
            case 3:
                return alog.n(alzz.as(((fgt) obj).i().c, new ezr(i)));
            case 4:
                fid fidVar = fid.a;
                return Integer.valueOf(((esa) obj).c);
            case 5:
                int i3 = fih.a;
                return Long.valueOf(((xab) obj).c);
            case 6:
                int i4 = fih.a;
                return Long.valueOf(((xab) obj).b);
            case 7:
                return (fqj) obj;
            case 8:
                return (fqj) obj;
            case 9:
                esz eszVar = (esz) obj;
                Bundle bundle = new Bundle();
                CharSequence charSequence = eszVar.t;
                if (charSequence != null) {
                    bundle.putCharSequence(esz.a, charSequence);
                    CharSequence charSequence2 = eszVar.t;
                    if (charSequence2 instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence2;
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        for (ete eteVar : (ete[]) spanned.getSpans(0, spanned.length(), ete.class)) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString(ete.a, eteVar.c);
                            bundle2.putInt(ete.b, eteVar.d);
                            arrayList.add(etb.a(spanned, eteVar, 1, bundle2));
                        }
                        for (etf etfVar : (etf[]) spanned.getSpans(0, spanned.length(), etf.class)) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putInt(etf.a, etfVar.d);
                            bundle3.putInt(etf.b, etfVar.e);
                            bundle3.putInt(etf.c, etfVar.f);
                            arrayList.add(etb.a(spanned, etfVar, 2, bundle3));
                        }
                        for (etc etcVar : (etc[]) spanned.getSpans(0, spanned.length(), etc.class)) {
                            arrayList.add(etb.a(spanned, etcVar, 3, null));
                        }
                        for (etg etgVar : (etg[]) spanned.getSpans(0, spanned.length(), etg.class)) {
                            Bundle bundle4 = new Bundle();
                            bundle4.putString(etg.a, etgVar.b);
                            arrayList.add(etb.a(spanned, etgVar, 4, bundle4));
                        }
                        if (!arrayList.isEmpty()) {
                            bundle.putParcelableArrayList(esz.b, arrayList);
                        }
                    }
                }
                bundle.putSerializable(esz.c, eszVar.u);
                bundle.putSerializable(esz.d, eszVar.v);
                bundle.putFloat(esz.g, eszVar.x);
                bundle.putInt(esz.h, eszVar.y);
                bundle.putInt(esz.i, eszVar.z);
                bundle.putFloat(esz.j, eszVar.A);
                bundle.putInt(esz.k, eszVar.B);
                bundle.putInt(esz.l, eszVar.G);
                bundle.putFloat(esz.m, eszVar.H);
                bundle.putFloat(esz.n, eszVar.C);
                bundle.putFloat(esz.o, eszVar.D);
                bundle.putBoolean(esz.q, eszVar.E);
                bundle.putInt(esz.p, eszVar.F);
                bundle.putInt(esz.r, eszVar.I);
                bundle.putFloat(esz.s, eszVar.J);
                if (eszVar.w != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    dzg.d(eszVar.w.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                    bundle.putByteArray(esz.f, byteArrayOutputStream.toByteArray());
                }
                return bundle;
            case 10:
                int i5 = fqz.a;
                return Long.valueOf(fqz.d(((xab) obj).c));
            case 11:
                xxn xxnVar = (xxn) obj;
                if (xxnVar == null) {
                    return xxn.a;
                }
                return xxnVar;
            case 12:
                return null;
            case 13:
                return uvl.a((Map) obj);
            case 14:
                alvw h = ijw.b.h();
                h.X(alwp.a, "Bugle");
                ((alvg) ((alvg) ((alvg) h).g((Throwable) obj)).h("com/google/android/apps/messaging/conversation/dataservice/ConversationDataServiceImpl", "insertRbmTombstone", 481, "ConversationDataServiceImpl.java")).q("Failed to insert RBM tombstone.");
                return null;
            case 15:
                ikf.a.r("Failed to unlatch conversation because querying online status failed.", (psx) obj);
                return false;
            case 16:
                return null;
            case 17:
                Optional map = ((Optional) obj).map(new idc(15));
                int i6 = alog.d;
                return (Iterable) map.orElse(alsx.a);
            case 18:
                return Optional.of(obj);
            case 19:
                return Long.valueOf(((sac) ((Optional) obj).get()).k());
            default:
                return Long.valueOf(((san) ((Optional) obj).get()).k());
        }
    }
}
