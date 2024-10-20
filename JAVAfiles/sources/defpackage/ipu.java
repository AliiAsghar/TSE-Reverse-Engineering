package defpackage;

import android.net.Uri;
import android.util.Size;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.ExpressiveStickerContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifContentItem;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ipu implements afkt, ioq {
    private final Supplier a;
    private final /* synthetic */ int b;
    private final ifb c;
    private final ifb d;

    public ipu(ifb ifbVar, ifb ifbVar2, Supplier supplier, int i) {
        this.b = i;
        this.c = ifbVar;
        this.d = ifbVar2;
        this.a = supplier;
    }

    @Override // defpackage.afkt
    public final /* synthetic */ Object a(afcq afcqVar, arpe arpeVar) {
        Object obj;
        MessagePartCoreData e;
        Object obj2;
        Object obj3;
        MessagePartCoreData e2;
        Object obj4;
        Uri uri;
        ameb amebVar;
        Size size;
        String str;
        boolean z = true;
        if (this.b != 0) {
            afql afqlVar = (afql) afcqVar;
            obj3 = this.a.get();
            ioa e3 = ((inq) obj3).e();
            if (!((Boolean) ipe.d.e()).booleanValue() || !e3.b()) {
                z = false;
            }
            afqr afqrVar = (afqr) afsy.b(afqlVar, new afrw(z), new Long(e3.a()));
            Uri parse = Uri.parse(afqrVar.b);
            String host = parse.getHost();
            host.getClass();
            aozy createBuilder = amqj.a.createBuilder();
            createBuilder.getClass();
            akec.X(amqh.GIF, createBuilder);
            akec.Y(amqi.EXPANDED, createBuilder);
            aauj aaujVar = new aauj(akec.W(createBuilder));
            if (((Boolean) utw.o.e()).booleanValue()) {
                ifb ifbVar = this.c;
                ina inaVar = new ina();
                inaVar.a("image/gif");
                inaVar.f = null;
                if (parse != null) {
                    inaVar.b = parse;
                    inaVar.f = parse;
                    inaVar.e = host;
                    ameb amebVar2 = ameb.GIF_CHOOSER;
                    if (amebVar2 != null) {
                        inaVar.c = amebVar2;
                        inaVar.a(afwv.L(afqrVar.a).a());
                        inaVar.d = new Size(afqrVar.c, afqrVar.d);
                        String str2 = inaVar.a;
                        if (str2 != null && (uri = inaVar.b) != null && (amebVar = inaVar.c) != null && (size = inaVar.d) != null && (str = inaVar.e) != null) {
                            e2 = ifbVar.d(new inb(str2, uri, amebVar, size, str, inaVar.f), aaujVar);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            if (inaVar.a == null) {
                                sb.append(" contentType");
                            }
                            if (inaVar.b == null) {
                                sb.append(" uri");
                            }
                            if (inaVar.c == null) {
                                sb.append(" contentSource");
                            }
                            if (inaVar.d == null) {
                                sb.append(" size");
                            }
                            if (inaVar.e == null) {
                                sb.append(" domain");
                            }
                            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                        }
                    } else {
                        throw new NullPointerException("Null contentSource");
                    }
                } else {
                    throw new NullPointerException("Null uri");
                }
            } else {
                e2 = this.d.e(new GifContentItem(parse, parse, parse, host, afqlVar.b, afqlVar.a, afqrVar.c, afqrVar.d), aaujVar);
            }
            obj4 = this.a.get();
            ((inq) obj4).c(e2);
            return afky.a;
        }
        afxr afxrVar = (afxr) afcqVar;
        obj = this.a.get();
        ioa e4 = ((inq) obj).e();
        if (!((Boolean) ipe.d.e()).booleanValue() || !e4.b()) {
            z = false;
        }
        afqr afqrVar2 = (afqr) afsy.b(afxrVar, new afrw(z), new Long(e4.a()));
        String str3 = afqrVar2.b;
        afsk afskVar = afqrVar2.a;
        Uri parse2 = Uri.parse(str3);
        String a = afwv.L(afskVar).a();
        aozy createBuilder2 = amqj.a.createBuilder();
        createBuilder2.getClass();
        akec.X(amqh.STICKER, createBuilder2);
        akec.Y(amqi.EXPANDED, createBuilder2);
        aauj aaujVar2 = new aauj(akec.W(createBuilder2));
        if (((Boolean) utw.o.e()).booleanValue()) {
            ifb ifbVar2 = this.c;
            if (parse2 != null) {
                if (a != null) {
                    Size size2 = new Size(afqrVar2.c, afqrVar2.d);
                    String str4 = afxrVar.a;
                    ameb amebVar3 = ameb.STICKER_CHOOSER;
                    if (amebVar3 != null) {
                        e = ifbVar2.d(new imx(a, parse2, amebVar3, size2, str4), aaujVar2);
                    } else {
                        throw new NullPointerException("Null contentSource");
                    }
                } else {
                    throw new NullPointerException("Null contentType");
                }
            } else {
                throw new NullPointerException("Null uri");
            }
        } else {
            e = this.d.e(new ExpressiveStickerContentItem(parse2, a, afqrVar2.c, afqrVar2.d, afxrVar.a, ameb.STICKER_CHOOSER), aaujVar2);
        }
        obj2 = this.a.get();
        ((inq) obj2).c(e);
        return afky.a;
    }

    @Override // defpackage.afkt
    public final /* synthetic */ void c(afcq afcqVar) {
        if (this.b != 0) {
            ((afql) afcqVar).getClass();
        } else {
            ((afxr) afcqVar).getClass();
        }
    }

    @Override // defpackage.afkt
    public final /* synthetic */ void d(afcq afcqVar) {
        if (this.b != 0) {
        }
    }

    @Override // defpackage.ioq
    public final /* synthetic */ arqr h() {
        if (this.b != 0) {
            return ipb.a;
        }
        return ipt.a;
    }

    @Override // defpackage.ioq
    public final boolean i(MessagePartCoreData messagePartCoreData) {
        if (this.b != 0) {
            messagePartCoreData.getClass();
            if (messagePartCoreData.bh() && messagePartCoreData.M() == ameb.GIF_CHOOSER) {
                return true;
            }
            return false;
        }
        messagePartCoreData.getClass();
        if ((messagePartCoreData.bh() || messagePartCoreData.bf()) && messagePartCoreData.M() == ameb.STICKER_CHOOSER) {
            return true;
        }
        return false;
    }

    @Override // defpackage.afkt
    public final /* synthetic */ void b() {
    }
}
