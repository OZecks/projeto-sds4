import { Seller } from "./seller"

export type Sale = {
    id: number;
    visited: number;
    deals: number;
    amount: number;
    date: string;
    seller: Seller;
}

export type SalePage = {
    content?: Sale[];
    last: boolean;
    totalPages: number;
    totalElements: number;
    size?: number;
    number: number;
    first: boolean;
    numberOfElements?: number;
    empty?: boolean;
}

export type SaleSum = {
    sum: number;
    sellerName: string;
}

export type SaleSuccess = {
    visited: number;
    deals: number;
    sellerName: string;
}