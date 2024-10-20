package com.google.gson.internal.bind;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseSerializer;
import defpackage.aonx;
import defpackage.aooc;
import defpackage.aood;
import defpackage.aoof;
import defpackage.aoon;
import defpackage.aooo;
import defpackage.aoqd;
import defpackage.aoqe;
import defpackage.aorn;
import defpackage.aoro;
import defpackage.aorp;
import defpackage.aotl;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class TreeTypeAdapter extends aoqd {
    final aonx a;
    private final aooc b;
    private final aorn c;
    private final aooo d;
    private final aoqe e = new aoqe();
    private final boolean f;
    private volatile aoon g;
    private final ConversationSuggestionResponseSerializer.AnonymousClass1 h;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static final class SingleTypeFactory implements aooo {
        private final aorn a;
        private final boolean b;
        private final aooc c;
        private final ConversationSuggestionResponseSerializer.AnonymousClass1 d;

        public SingleTypeFactory(Object obj, aorn aornVar, boolean z) {
            ConversationSuggestionResponseSerializer.AnonymousClass1 anonymousClass1;
            if (obj instanceof ConversationSuggestionResponseSerializer.AnonymousClass1) {
                anonymousClass1 = (ConversationSuggestionResponseSerializer.AnonymousClass1) obj;
            } else {
                anonymousClass1 = null;
            }
            this.d = anonymousClass1;
            aooc aoocVar = obj instanceof aooc ? (aooc) obj : null;
            this.c = aoocVar;
            boolean z2 = true;
            if (anonymousClass1 == null && aoocVar == null) {
                z2 = false;
            }
            d.s(z2);
            this.a = aornVar;
            this.b = z;
        }

        @Override // defpackage.aooo
        public final aoon a(aonx aonxVar, aorn aornVar) {
            if (!this.a.equals(aornVar)) {
                if (this.b) {
                    aorn aornVar2 = this.a;
                    if (aornVar2.b != aornVar.a) {
                        return null;
                    }
                } else {
                    return null;
                }
            }
            return new TreeTypeAdapter(this.d, this.c, aonxVar, aornVar, this, true);
        }
    }

    public TreeTypeAdapter(ConversationSuggestionResponseSerializer.AnonymousClass1 anonymousClass1, aooc aoocVar, aonx aonxVar, aorn aornVar, aooo aoooVar, boolean z) {
        this.h = anonymousClass1;
        this.b = aoocVar;
        this.a = aonxVar;
        this.c = aornVar;
        this.d = aoooVar;
        this.f = z;
    }

    private final aoon e() {
        aoon aoonVar = this.g;
        if (aoonVar != null) {
            return aoonVar;
        }
        aoon c = this.a.c(this.d, this.c);
        this.g = c;
        return c;
    }

    @Override // defpackage.aoon
    public final Object a(aoro aoroVar) {
        if (this.b == null) {
            return e().a(aoroVar);
        }
        aood r = aotl.r(aoroVar);
        if (this.f && (r instanceof aoof)) {
            return null;
        }
        aooc aoocVar = this.b;
        aorn aornVar = this.c;
        return aoocVar.deserialize(r, aornVar.b, this.e);
    }

    @Override // defpackage.aoon
    public final void b(aorp aorpVar, Object obj) {
        ConversationSuggestionResponseSerializer.AnonymousClass1 anonymousClass1 = this.h;
        if (anonymousClass1 == null) {
            e().b(aorpVar, obj);
            return;
        }
        if (this.f && obj == null) {
            aorpVar.j();
            return;
        }
        aorn aornVar = this.c;
        aotl.s(anonymousClass1.serialize(obj, aornVar.b, this.e), aorpVar);
    }

    @Override // defpackage.aoqd
    public final aoon c() {
        if (this.h != null) {
            return this;
        }
        return e();
    }
}
