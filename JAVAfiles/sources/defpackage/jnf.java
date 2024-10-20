package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.conversation2.bottomcontent.composerow.draft.attachment.RichLocation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnf implements jnb {
    private final /* synthetic */ int a;

    public jnf(int i) {
        this.a = i;
    }

    @Override // defpackage.jnb
    public final Object a(jgz jgzVar, jnd jndVar, String str, arpe arpeVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                afcq afcqVar = jgzVar.a;
                if (afcqVar instanceof RichLocation) {
                    RichLocation richLocation = (RichLocation) afcqVar;
                    if (d.F(richLocation.d.a(), "application/vnd.gsma.rcspushlocation+xml")) {
                        return new jnp(new jnw(richLocation.e, richLocation.a, richLocation.b, richLocation.c), null);
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            }
            afcq afcqVar2 = jgzVar.a;
            if (afcqVar2 instanceof afqc) {
                return new jnp(new jns((afqc) afcqVar2, jgzVar.b.a), null);
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
        afcq afcqVar3 = jgzVar.a;
        if (afcqVar3 instanceof aftn) {
            aftn aftnVar = (aftn) afcqVar3;
            Uri uri = jgzVar.b.a;
            Uri parse = Uri.parse(aftnVar.b);
            if (uri == null) {
                uri = parse;
            }
            String a = afwv.L(aftnVar.a).a();
            uri.getClass();
            return new jnp(new jnq(a, uri, aftnVar.e, aftnVar.f), parse);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
