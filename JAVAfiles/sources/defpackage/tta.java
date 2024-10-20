package defpackage;

import com.google.communication.synapse.security.scytale.DbWrapperFactory;
import com.google.communication.synapse.security.scytale.DbWrapperInterface;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class tta extends DbWrapperFactory {
    final /* synthetic */ twi a;

    public tta(twi twiVar) {
        this.a = twiVar;
    }

    @Override // com.google.communication.synapse.security.scytale.DbWrapperFactory
    public final DbWrapperInterface createDbWrapper() {
        return this.a;
    }
}
