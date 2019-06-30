<template>
    <u-form-grid :data="formGrid" ref="formGrid"></u-form-grid>
</template>

<script>
    export default {
        name: 'BusinessTransferRegister',
        data() {
            return {
                formGrid: {
                    options: {
                        url: {
                            page: "/BusinessHandlerController/businessTransferRegister/page",
                            save: "/BusinessHandlerController/businessTransferRegister/save",
                            delete: "/BusinessHandlerController/businessTransferRegister/delete",
                        }
                    },
                    tips: {title: "BusinessTransferRegister", content: "BusinessTransferRegister"},
                    form: {
                        modal: {
                            title: "BusinessTransferRegister"
                        },
                        columns: [
                                                        {label: "dateHandler", type: "text", name: "dateHandler", required: true},
                                                        {label: "handoverMatter", type: "text", name: "handoverMatter", required: true},
                                                        {label: "transfer", type: "text", name: "transfer", required: true},
                                                        {label: "receiver", type: "text", name: "receiver", required: true},
                                                        {label: "supervisor", type: "text", name: "supervisor", required: true},
                            
                        ]
                    },
                    table: {
                        operation: {
                            primaryKey: "id",
                        },
                        columns: [
                                                        {title: 'dateHandler', key: 'dateHandler',minWidth:120},
                                                        {title: 'handoverMatter', key: 'handoverMatter',minWidth:120},
                                                        {title: 'transfer', key: 'transfer',minWidth:120},
                                                        {title: 'receiver', key: 'receiver',minWidth:120},
                                                        {title: 'supervisor', key: 'supervisor',minWidth:120},
                                                    ]
                    }
                }
            }
        },
        methods: {}
    }
</script>


