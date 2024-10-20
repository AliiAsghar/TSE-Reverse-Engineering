package defpackage;

import defpackage.apaa;
import defpackage.apab;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class apab<MessageType extends apab<MessageType, BuilderType>, BuilderType extends apaa<MessageType, BuilderType>> extends apag<MessageType, BuilderType> implements apac<MessageType, BuilderType> {
    public aozu l = aozu.a;

    public final aozu a() {
        aozu aozuVar = this.l;
        if (aozuVar.c) {
            this.l = aozuVar.clone();
        }
        return this.l;
    }

    public final void b(apae apaeVar) {
        if (apaeVar.a == getDefaultInstanceForType()) {
        } else {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    @Override // defpackage.apac
    public final boolean cs(aozq aozqVar) {
        throw null;
    }
}
